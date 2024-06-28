package com.haslam;

import com.haslam.Entity.Membership;
import com.haslam.Entity.SubscriptionType;
import com.haslam.Repository.MembershipRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class JpaApplicationTests {

	@Autowired
	private MembershipRepository membershipRepository;

	@Test
	void createMembershipTest() {
		Assertions.assertDoesNotThrow
				(() -> {
					Membership membership = new Membership();
					membership.setSubscriptionType(SubscriptionType.PREMIUM);

					membershipRepository.save(membership);
				});
	}

	@Test
	void getMembershipTest(){
		List<Membership> memberships = membershipRepository.findAll();

		Assertions.assertNotNull(memberships);

		memberships.forEach(System.out::println);
	}

}
