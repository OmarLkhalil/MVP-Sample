# MVP-Sample

MVP in simple words
User: Click click …

View: Who’s that?

User: I just clicked on the search button …

View: Ok, hold on a sec … .

( View calling the Presenter … )

View: Hey Presenter, a User has just clicked on the search button, what shall I do?

Presenter: Hey View, is there any search term on that page?

View: Yes,… here it is … “dummy search term”

Presenter: Good,… meanwhile I’m looking up the search term on the Model, please show him/her a progress bar

( Presenter is calling the Model … )

Presenter: Hey Model, Do you have any match for this search term?: “dummy search term”

Model: Hey Presenter, let me check …

( Model is making a query to the database … )

(After a while, Model comes back with some result to the presenter)

Model: I found a list for you Presenter, here it is “dummy search result”

(Presenter thanks Model for the list and gets back to the View)

Presenter: Thanks for waiting View, I found a list of matching results for you from the Model and arranged them in a presentable format. Please show it to the user in a vertical list.

View: No worries,… This is what I’m good at …

Presenter: … and don’t forget to hide the progress bar

( View gets back to the user and hides the progress bar …)

View: Thanks for waiting User, here is the list of matching results in a vertical list

User: oh, what a lovely app, can I know the developer’s name by any chance? 
