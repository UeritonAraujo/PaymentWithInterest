# Payment of Contract in Installments with Interest

> Status: Developing 🚨

[![NPM](https://img.shields.io/badge/License-MIT-green)](https://github.com/UeritonAraujo/PaymentWithInterest/blob/main/LICENSE)

A company wants to automate the processing of its contracts. Processing a contract consists of generating the INSTALLMENTS TO BE PAID FOR THAT CONTRACT, based on the desired number of months.

The company uses an online PAYMENT SERVICE to pay installments. Online payment services typically charge a monthly interest as well as a per-payment fee. 
For example, the service contracted by the company is Paypal, which applies SIMPLE INTEREST of 1% to each installment, plus a 2% payment FEE.

Make a program to read the data from a contract (contract number, contract date, and total contract value). Then, the program must read the number of months for installments of the contract, 
and then generate records of installments to be paid (due date and installment value), with the first installment being one month after the date of the contract, the second installment being two months after the contract,
so on. Show installment data and values ​​on the screen.

## Technologies Used:

<table>
  <tr>
    <td>
      Java
    </td>
  </tr>
  <tr>
    <td>
      21
    </td>
  </tr>
</table>

## Application example - information:
  
> Enter the contract details
  * Number: 8028
  * Date (dd/MM/yyyy): 25/06/2024
  * Contract Price: 600.00
  * Number of installments: 3
    
> Installments:
 * 25/07/2024 - Amount: 206.04
 * 25/08/2024 - Amount: 208.08
 * 25/09/2024 - Amount: 210.12

### Calculations (1% simple monthly interest + 2% payment fee):

> Installment 1
  * 200 + 1% * 1 = 202
  * 202 + 2% = 206.04

> Installment 2
  * 200 + 1% * 2 = 204
  * 204 + 2% = 208.08

> Installment 3
  * 200 + 1% * 3 = 206
  * 206 + 2% = 210.12
