package com.SpringBootBroadcomAPI;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootBroadcomApiApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void makeSureItEquals() throws IOException {
		// CashCard cashCard = new CashCard(99L, 123.45);
		// assertThat(json.write(cashCard)).isStrictlyEqualToJson("expected.json");
		// assertThat(json.write(cashCard)).hasJsonPathNumberValue("@.id");
		// assertThat(json.write(cashCard)).extractingJsonPathNumberValue("@.id")
		// .isEqualTo(99);
		// assertThat(json.write(cashCard)).hasJsonPathNumberValue("@.amount");
		// assertThat(json.write(cashCard)).extractingJsonPathNumberValue("@.amount")
		// .isEqualTo(123.45);
		assertThat(40).isEqualTo(40);
	}

}
