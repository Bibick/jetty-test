package law.smart.micro.jetty;

import com.netflix.discovery.DiscoveryClient;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class JettyApplicationIT extends AbstractIntegrationTest {

    @Autowired
    DiscoveryClient discoveryClient;

    @Test
    public void discoveryClientShouldBeAvailable() {
        assertNotNull("discoveryClient is null", discoveryClient);
    }

	@Test
	public void testHome() throws Exception {
		ResponseEntity<String> entity = new TestRestTemplate().getForEntity(
				"http://localhost:" + getPort(), String.class);
		assertEquals(HttpStatus.OK, entity.getStatusCode());
		assertEquals("{\"status\" : \"ok\"}", entity.getBody());
	}

	@Test
	public void testGet() throws Exception {
		ResponseEntity<String> entity = new TestRestTemplate().exchange("http://localhost:" + getPort() + "/test", HttpMethod.GET, HttpEntity.EMPTY, String.class);
		assertEquals(HttpStatus.BAD_REQUEST, entity.getStatusCode());
		assertTrue(entity.hasBody());
	}

	@Test
	public void testPost() throws Exception {
		ResponseEntity<String> entity = new TestRestTemplate().exchange("http://localhost:" + getPort() + "/test", HttpMethod.POST, HttpEntity.EMPTY, String.class);
		assertEquals(HttpStatus.BAD_REQUEST, entity.getStatusCode());
		assertTrue(entity.hasBody());
	}

	@Test
	public void testPut() throws Exception {
		ResponseEntity<String> entity = new TestRestTemplate().exchange("http://localhost:" + getPort() + "/test", HttpMethod.PUT, HttpEntity.EMPTY, String.class);
		assertEquals(HttpStatus.BAD_REQUEST, entity.getStatusCode());
		assertTrue(entity.hasBody());
	}

	@Test
	public void testDelete() throws Exception {
		ResponseEntity<String> entity = new TestRestTemplate().exchange("http://localhost:" + getPort() + "/test", HttpMethod.DELETE, HttpEntity.EMPTY, String.class);
		assertEquals(HttpStatus.BAD_REQUEST, entity.getStatusCode());
		assertTrue(entity.hasBody());
	}

}
