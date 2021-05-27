/*******************************************************************************
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 *******************************************************************************/
package iris.location_service.search.db;

import iris.location_service.search.db.model.Location;
import iris.location_service.search.db.model.LocationIdentifier;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

/**
 * @author Jens Kutzsche
 */
@Service
public class LocationDAO {

	@Value("${spring.datasource.driverClassName:}")
	private String datasourceDriver;

	@Autowired
	private LocationRepository locationRepo;

	@Transactional
	public void saveLocations(List<Location> locations) {

		locationRepo.saveAll(locations);

		if (isPostgresActive()) {
			locationRepo.updateTokens();
		}
	}

	public Page<Location> searchLocations(String keyword, Pageable pageable) {

		if (isPostgresActive()) {
			return locationRepo.fulltextSearch(keyword, pageable);
		} else {
			return locationRepo.findByNameContainingIgnoreCase(keyword, pageable);
		}
	}

	public Optional<Location> findById(LocationIdentifier ident) {
		return locationRepo.findById(ident);
	}

	public void delete(Location entity) {
		locationRepo.delete(entity);
	}

	public Streamable<Location> findByIdProviderId(String providerId) {
		return locationRepo.findByIdProviderId(providerId);
	}

	private boolean isPostgresActive() {
		return datasourceDriver.equals("org.postgresql.Driver");
	}
}
