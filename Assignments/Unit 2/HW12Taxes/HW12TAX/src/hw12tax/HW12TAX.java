/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw12tax;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class HW12TAX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE
                    float sumDeducible = 0.0F;
                    float taxBase = 0.0F;
                    float basicFraction = 0.0F;
                    float overBaseTax = 0.0F;
                    float incomeTax = 0.0F;
                    float annualPay;
                    float taxSalary;
                    float socialInsureValue;
                    float homeDeducible;
                    float foodDeducible;
                    float waterDeducible;
                    float energyDeducible;
                    
                    Scanner input = new Scanner(System.in);
                    System.out.println("*Welcome to Calculator Annual Salary*");
                    System.out.println("*My name is Sandy*");
                    System.out.println("****Enter your Annual Salary****");
                    annualPay = input.nextFloat();

                    taxSalary = (float) (annualPay - (annualPay * 0.0945));

                    System.out.println("****Enter your Home Deucible Final Value****");
                    homeDeducible = input.nextFloat();
                    System.out.println("****Enter your Food deducible Final Value****");
                    foodDeducible = input.nextFloat();
                    System.out.println("****Enter your Water Final Value****");
                    waterDeducible = input.nextFloat();
                    System.out.println("****Enter your Energy Deducible Final Value****");
                    energyDeducible = input.nextFloat();

                    sumDeducible = (float) (sumHomeDeducibles(homeDeducible)+ sumFoodDeducibles(foodDeducible) + computeWater(waterDeducible) + computeEnergy(energyDeducible));

                    System.out.println("Your deducible sum is equal to --> " + computeSumDeducible(sumDeducible));

                    taxBase = (float) (annualPay - computeSumDeducible(sumDeducible));

                    System.out.println("Your Tax Base is --> " + taxBase);
                    basicFraction = computeBasicFraction(taxBase, (int) basicFraction);
                    System.out.println("Your basic fraction is " + basicFraction);
                    overBaseTax = computeIncomeTax(taxBase, overBaseTax);
                    System.out.println("The value of the Income Tax over base is --> " + overBaseTax);

                    incomeTax = basicFraction + overBaseTax;
                    System.out.println("Your Income Tax to pay is $" + incomeTax);
                    System.out.println("***BYE USER****");

        }
    public static int computeBasicFraction(float taxBase, int basicFraction) {
        if (taxBase < 11212) {
            return 0;
        } else {
            if (taxBase < 14285) {
                return 0;
            } else {
                if (taxBase < 17854) {
                    return 154;
                } else {
                    if (taxBase < 21442) {
                        return 511;
                    } else {
                        if (taxBase < 42874) {
                            return 64297;
                        } else {
                            if (taxBase < 64297) {
                                return 4156;
                            } else {
                                if (taxBase < 85729) {
                                    return 8440;
                                } else {
                                    if (taxBase < 144288) {
                                        return 13798;
                                    } else {
                                        if (taxBase > 144288) {
                                            return 22366;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return basicFraction;
    }

    public static double sumHomeDeducibles(float homeDeducible) {
        if (homeDeducible > 3643.90) {
            return 3643.9;
        } else {
            return homeDeducible;
        }
    }


    public static double sumFoodDeducibles(float foodDeducible) {
        if (foodDeducible > 3643.90) {
            return 3643.9;
        } else {
            return foodDeducible;
        }
    }

    public static double computeWater(float waterDeducible) {
        if (waterDeducible > 3643.90) {
            return 3643.9;
        } else {
            return waterDeducible;
        }
    }

    public static double computeEnergy(float healthDeducible) {
        if (healthDeducible > 14575.60) {
            return 14575.60;
        } else {
            return healthDeducible;
        }
    }

    public static double computeSumDeducible(float sumDeducible) {
        if (sumDeducible > 14575.60) {
            return 14575.60;
        } else {
            return sumDeducible;
        }
    }
        
  public static float computeIncomeTax(float taxBase, float overBaseTax) {
        if (taxBase < 11212) {
            return 0;
        } else {
            if (taxBase < 14285) {
                return (float) ((taxBase - 11212) * 0.05);
            } else {
                if (taxBase < 17854) {
                    return (float) ((taxBase - 14285) * 0.10);
                } else {
                    if (taxBase < 21442) {
                        return (float) ((taxBase - 17854) * 0.12);
                    } else {
                        if (taxBase < 42874) {
                            return (float) ((taxBase - 21442) * 0.15);
                        } else {
                            if (taxBase < 64297) {
                                return (float) ((taxBase - 42874) * 0.20);
                            } else {
                                if (taxBase < 85729) {
                                    return (float) ((taxBase - 64297) * 0.25);
                                } else {
                                    if (taxBase < 144288) {
                                        return (float) ((taxBase - 85729) * 0.30);
                                    } else {
                                        if (taxBase > 144288) {
                                            return (float) ((taxBase - 144288) * 0.35);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return overBaseTax;
    }
}