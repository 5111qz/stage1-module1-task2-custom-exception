package com.epam.mjc;

class CustomException extends IllegalArgumentException {
  public CustomException() {
    super("Could not find student with ID {id}");
 }
}
