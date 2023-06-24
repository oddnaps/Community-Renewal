package main

import "fmt"

// Community Renewal project
// This program aims to address the issues that arise from living in an area with
// declining infrastructure and resources.
func main() {
	// Create a set of variables to represent the data we want to store 
	// related to the community renewal project
	var communityName string
	var population int
	var unemploymentRate float64
	var povertyRate float64
	var publicServices []string
	var housingTypes []string
	var publicTransportation []string

	// Assign values to the variables 
	communityName = "Low-Income Community"
	population = 50000
	unemploymentRate = 17.5
	povertyRate = 27.2
	publicServices = []string{"Police","Fire","EMS","Public Works"}
	housingTypes = []string{"Rent-Controlled","Subsidized Housing","Affordable Housing"}
	publicTransportation = []string{"Bus","Light Rail","Bike Share"}

	// Print out information about the community
	fmt.Println("Community Name:", communityName)
	fmt.Println("Population:", population)
	fmt.Println("Unemployment Rate:", unemploymentRate,"%")
	fmt.Println("Poverty Rate:", povertyRate,"%")
	fmt.Println("Public Services:", publicServices)
	fmt.Println("Housing Types:", housingTypes)
	fmt.Println("Public Transportation:", publicTransportation)


	// Create a variable to represent the total amount of funding for the project
	var totalFunding int 
	totalFunding = 5000000

	// Create a list of activities to be completed as part of the project
	var activities []string
	activities = []string{"Infrastructure Repair","Housing Renovation","Job Training","Public Transportation Expansion"}

	// Create a set of variables to represent the total amount of funding 
	// allocated to each activity
	var infraRepairFunding int
	var housingRenovationFunding int
	var jobTrainingFunding int
	var transportExpansionFunding int

	// Assign values to the activity funding variables 
	infraRepairFunding = 500000
	housingRenovationFunding = 2500000
	jobTrainingFunding = 2000000
	transportExpansionFunding = 1500000

	// Create a map to represent the amount of funding allocated to each activity
	fundingByActivity := map[string]int {
		"Infrastructure Repair" : infraRepairFunding,
		"Housing Renovation" : housingRenovationFunding,
		"Job Training" : jobTrainingFunding,
		"Public Transportation Expansion" : transportExpansionFunding,
	}

	// Print out the total funding and the amount of funding allocated to each activity
	fmt.Println("Total Funding:", totalFunding)
	fmt.Println("Funding by Activity:", fundingByActivity)

	// Iterate over the list of activities and print the activity name and budget 
	for _, activity := range activities {
		fmt.Println("Activity:", activity)
		fmt.Println("Budget:",fundingByActivity[activity])
		fmt.Println()
	}

	// Create a variable with the total amount of funding actually spent 
	var totalSpent int 
	totalSpent = 3000000

	// Calculate and print the total remaining budget
	fmt.Println("Total Budget Remaining:",totalFunding-totalSpent)
}