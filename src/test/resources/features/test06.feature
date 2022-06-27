
@test06
  Feature: Contact Us Form
    Scenario: Contact Us Form
      Given launch the browser
      When user navigate the url
      Then verify that home page is visible successfully
      And click contact us button
      And verify get in touch is visible
      And enter name, email, subject and message
      And upload file
      Then click submit button
      Then click OK button
      And verify success message Success!.Your details have been submitted successfully. is visible
      Then click Home button and verify that landed to home page successfully
      Then close the page
