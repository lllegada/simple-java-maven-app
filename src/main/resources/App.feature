Background: App Test

	Scenario: Testing the construction
		Given An empty construction
		When I execute it
		Then The result is not Construction failed

	Scenario: Return message
		Given A message
		When I pass Hello World as a parameter
		Then It would return Hello World as well
