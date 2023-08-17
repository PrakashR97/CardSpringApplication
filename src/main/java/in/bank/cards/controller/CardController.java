package in.bank.cards.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.bank.cards.model.Cards;
import in.bank.cards.model.Customer;
import in.bank.cards.repository.CardsRepository;

@RestController
public class CardController {

	@Autowired
	CardsRepository cardsRepository;

	@PostMapping("/cards")
	public List<Cards> getCustomerCardDetails(@RequestBody Customer customer) {
		
		// customer.setCustomerId(1);
		System.out.println(customer.getCustomerId());
		List<Cards> cards = cardsRepository.findByCustomerId(customer.getCustomerId());
		return cards;
	}

}
