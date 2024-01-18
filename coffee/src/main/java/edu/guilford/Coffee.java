package edu.guilford;

public class Coffee {
//atrributes
private String type;
private String sequence;
private int length;

//add an attribute that's an array of Strings for the three-letter codes
//for the blends  (e.g. "Mocha" would be "MOC") 
private String[] blends = {"MOC", "LAT", "ESP", "CAP", "AME", "FLA", "BRE", "ICE"};
private String[] threeCode;

// add an attribute with a final String with the possible one-letter codes
// for the different sizes (e.g. "Small" would be "S")
private final String sizes = "SJMTL";

// constructor
public Coffee(String type, String sequence) {
    this.type = type;
    this.sequence = sequence;
    this.length = sequence.length();
    this.threeCode = new String[length];
    generateThreeCode();
}

// constructor to generate a random coffee of a given length
public Coffee(int length) {
    this.length = length;
    this.sequence = "";
    this.threeCode = new String[length];
    this.type = blends[(int)(Math.random()*blends.length)];
    for (int i = 0; i < length; i++) {
        this.sequence += sizes.charAt((int)(Math.random()*sizes.length()));
        this.threeCode[i] = blends[(int)(Math.random()*blends.length)];
    }
}

// methods
public String getType() {
    return this.type;
}

public String getSequence() {
    return this.sequence;
}

public int getLength() {
    return this.length;
}

public String[] getThreeCode() {
    return this.threeCode;
}


public String toString() {
    return this.type + " " + this.sequence;
}

public boolean equals(Coffee other) {
    return this.type.equals(other.type) && this.sequence.equals(other.sequence);
}

public boolean isBefore(Coffee other) {
    return this.type.compareTo(other.type) < 0 || (this.type.equals(other.type) && this.sequence.compareTo(other.sequence) < 0);
}

public boolean isAfter(Coffee other) {
    return this.type.compareTo(other.type) > 0 || (this.type.equals(other.type) && this.sequence.compareTo(other.sequence) > 0);
}

public boolean isBetween(Coffee first, Coffee last) {
    return this.isAfter(first) && this.isBefore(last);
}

// setters
public void setType(String type) {
    this.type = type;
}

public void setSequence(String sequence) {
    this.sequence = sequence;
}

public void setLength(int length) {
    this.length = length;
}

public void setThreeCode(String[] threeCode) {
    this.threeCode = threeCode;
}

// method to generate the three-letter codes for the blends
public void generateThreeCode() {
    for (int i = 0; i < length; i++) {
        this.threeCode[i] = blends[(int)(Math.random()*blends.length)];
    }
}

}
