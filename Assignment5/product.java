package Assignment5;

final class Product {

	private final String name;
	private final String code;
	private final double price;
	private final String category;

	private Product(Builder builder) {
		this.name = builder.name;
		this.code = builder.code;
		this.price = builder.price;
		this.category = builder.category;
	}

	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	public double getPrice() {
		return price;
	}

	public String getCategory() {
		return category;
	}

	public String toString() {
		return "Product{" + "name='" + name + '\'' + ", code='" + code + '\'' + ", price=" + price + ", category='"
				+ (category != null ? category : " n/a") + '\'' + '}';
	}

	public static class Builder {
		private String name;
		private String code;
		private double price;
		private String category;

		public Builder withName(String name) {
			if (name == null || name.trim().isEmpty()) {
				throw new IllegalArgumentException("Product name cannot be empty.");
			}
			this.name = name;
			return this;
		}

		public Builder withCode(String code) {
			if (code == null || code.trim().isEmpty()) {
				throw new IllegalArgumentException("Product code cannot be empty.");
			}
			this.code = code;
			return this;
		}

		public Builder withPrice(double price) {
			if (price < 0) {
				throw new IllegalArgumentException("Price cannot be negative.");
			}
			this.price = price;
			return this;
		}

		public Builder withCategory(String category) {
			this.category = category;
			return this;
		}

		public Product build() {

			if (name == null || code == null) {
				throw new IllegalStateException("Name and Code are mandatory.");
			}
			return new Product(this);
		}
	}
}

class ProductDemo {
	public static void main(String[] args) {

		Product p1 = new Product.Builder().withName("Laptop").withCode("LP1001").withPrice(75000)
				.withCategory("Electronics").build();

		System.out.println(p1);

		Product p2 = new Product.Builder().withName("Mouse").withCode("MS2001").withPrice(1200).build();

		System.out.println(p2);
	}
}
