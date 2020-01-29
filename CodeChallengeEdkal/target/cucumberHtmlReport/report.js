$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AmazonSearchHeadphones.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#This feature file will test search functionality and add to kart"
    },
    {
      "line": 2,
      "value": "#Author: Satendra Dixit"
    }
  ],
  "line": 3,
  "name": "validate search product on amazon",
  "description": "",
  "id": "validate-search-product-on-amazon",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "To verify search functionality",
  "description": "",
  "id": "validate-search-product-on-amazon;to-verify-search-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@UI_Test"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Open browser and luanch the website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Enter the text Headphones in the search box Hit enter",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "From the results displayed on page add all the items marked as Best seller to the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchProductStepDef.Open_browser_and_luanch_the_website()"
});
formatter.result({
  "duration": 40506928399,
  "status": "passed"
});
formatter.match({
  "location": "SearchProductStepDef.Enter_the_text_Headphones_in_the_search_box_Hit_enter()"
});
formatter.result({
  "duration": 13270218500,
  "status": "passed"
});
formatter.match({
  "location": "SearchProductStepDef.From_the_results_displayed_on_page1_add_all_the_items_marked_as_Best_seller_to_the_cart()"
});
formatter.result({
  "duration": 91323932500,
  "status": "passed"
});
});