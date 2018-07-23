package icehs.science.chapter03;

public class TypeCastingEx {

	public static void main(String[] args) {
		long billWealth = 7000000000l;
		System.out.println("original Value : "+ billWealth);
		
		double douBlebillWealth = billWealth;
		System.out.println("double형으로 변한 : "+doubleBillWealth);
		
		int intBillWealth = (int)billWealth;
		System.out.println("int형으로 강제 변환 :" + intBillWealth);

	}

}
