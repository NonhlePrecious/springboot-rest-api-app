# Automated Withdrawal Notice Process

**Instructions:**

1. Fork this repository to your own Gitlab account and ensure you set your repo visibility to private.
2. Clone the forked repository to your local machine.
3. After completing each exercise: git add, git commit and git push to your forked repository.

## Overview
A FINTECH company is seeking to automate the withdrawal notice process for its investors.
The current process, which involves downloading, completing, signing, and emailing PDF forms, is time-consuming and prone to errors.
This project aims to improve the investor experience and save time for the service area.

## Features
The automated process will allow investors to:
- Select a product they are withdrawing from
- Capture the withdrawal amount, dates, and banking details
- Receive a notification showing the balance before the withdrawal, the amount withdrawn, and the closing balance

## Tasks
1. Retrieve investor information (personal, address, and contact) along with a list of products the investor has invested in. 
  Each product must provide a product ID, type (RETIREMENT/SAVINGS), name, and the current balance.
2. Create a new WITHDRAWAL NOTICE for a selected product.
3. Download a statement of all notices created for a selected product as a CSV file with a provided date range.

## Validations
On submission of a WITHDRAWAL NOTICE via the API, the following validations must be applied:
- Investors cannot withdraw an AMOUNT more than 90% of the current BALANCE.

## Technical Notes
- All code should be written in a package `com.enviro.assessment.grad001.yournameandsurname`.
- Each record has a primary key called “id” that identifies it.
- An in-memory database (H2) will be implemented as part of this exercise.
- The submission must be a Springboot application with REST endpoints.

## Interview
You may undergo a subsequent interview regarding your solution, 
so please be prepared to discuss any design decisions you may have taken/assumed. 
Perhaps make relevant comments in your code that will guide your discussions later.
