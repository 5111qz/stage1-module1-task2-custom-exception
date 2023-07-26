package com.epam.mjc;

class CustomException extends IllegalArgumentException {
  public CustomException(long studentID) {
    super("Could not find student with ID {" + studentID + "}");
 }
}
