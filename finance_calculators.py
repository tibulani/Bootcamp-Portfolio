#This is a Python program called finance_calculator.
#this program calculate the amount of interest one will earn on investment and repayment amount on home loan
#the user will supply amount, duration and interest rate 

import math 

financial_products = input("""Choose either investment or bond from the manu below to proceed:

investment   - to calculate the amount of interest you'll earn on interest
bond         - to calculate the amount you'll pay on a home loan
\n""").lower()
#calculate the amount of interest you'll earn on interest on investment

if  financial_products == "investment":
    deposit = float(input("Enter the deposit amount:\n"))
    interest_rate = float(input("Enter annual interest rate:\n"))
    years = int(input("Enter number of years:\n"))
    p = deposit
    r = interest_rate
    t = years
    interest = input("simple or compound interest rate ?\n").lower()
    variable = interest
    if variable == "simple":
        simple = p*(1+ r/100 *t)#Python simple interest rate is calculated as follows : A =P*(1+r*t)
        s_interest_amount = simple - p #Calculation of interest earned
        print("The total interest amount earned is R"+str(s_interest_amount))
        print("And")
        print("The investment amount at maturity date is R"+ str(simple))
    else:
        compound = p*math.pow((1+ r/100),t) # Python Compound interest rate is calculated as follows : A = P* math.pow((1+r),t)
        c_interest_amount = compound - p #Calculation of interest earned
        print("The total interest amount earned is R"+str(c_interest_amount)) 
        print("And")
        print("The investment amount at maturity date is R"+ str(compound))

#calculate repayment amount on home loan
else:
    present_value = float(input("Enter the present value of the house:\n"))
    rate_bond = float(input("Enter annual interest rate :\n"))
    months = int(input("Enter number of months will take to repay loan:\n"))
    pv = present_value
    r = rate_bond/12
    n = months
    # Python Compound repayment calculated as follows PV((r*(1 + r)**n )/(((1 + r)**n ) - 1))
    numerator = (r*((1+r)**(n)))
    demominator = ((1+r)**(n))-1
    repayment_amo = pv * (numerator / demominator)
    print("The monthly repayment amount R"+ str(repayment_amo))

#.........................This is the End..................................

                
