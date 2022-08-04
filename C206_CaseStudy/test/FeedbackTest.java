	@Test
	public void testViewAllFeedback() { 
/// CREATE FEEDBACK
	
// test that feedbacks are added accordingly
	assertNotNull("test if there is a feedback list to add into", feedbackList); {
	
// test that feedback is recorded
	assertEquals("test feedback's list plus 1 after adding", 1, feedbacksList.size());

/// VIEW FEEDBACK
// test that feedbacks are added accordingly
	assertNotNull("test if there is a feedback list to add into", feedbackList);
	
// Test that all the feedbacks are loaded and displayed
	assertEquals("test that list has 5 feedbacks", 5, feedbackList.size());


/// DELETE FEEDBACK
    
// check that the feedback data is removed from the database
 	assertEquals("feedbackList should be empty", 0, feedbackList.size());
   
// test that list is not null when item is deleted
    assertEquals("test that arraylist size is at least 1 ", 1, feedbackList.size());

// Delete the item, and test if the size of the list is 0
    assertEquals("test if that arraylist size is 0?", 0, feedbackList.size());
    
// test for valid array list to edit from
    assertNotNull("test if there is a valid list to delete from", feedbackList);
  }
}