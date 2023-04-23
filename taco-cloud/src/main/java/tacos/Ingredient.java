package tacos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AccessLevel;

@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
@Entity

public class Ingredient {
	@Id
	private final String id;
	private final String name;
	@Enumerated(EnumType.STRING)

	private final Type type;

	public static enum Type {
		WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
	}


}
