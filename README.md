ReadMe File 

Music Playlist Manager Application report 

 

I have designed an app to help users around the world to create and manage their own playlists. The purpose of this app is to allow users to rate songs while adding thier own comments and information about the artist. 

  

This application consists of 2 screens 

 

This is what the application looks like on the first screen- Main Screen 

 



 <img width="251" alt="Screenshot 2025-06-19 at 13 00 31" src="https://github.com/user-attachments/assets/4fe0ee3f-a72c-4658-b6c9-4ccf0d6c055a" />


 

 it has 4 edit text texts: 

Song Title  

Artist Name 

Rating (1-5) 

Comments 

 

 as well as 3 buttons for the user to interact with: 

Add to playlist  

Go to Playlist Screen 

Exit 

 

This is what the application looks like on the second screen- Detailed view Screen, containing 3 more buttons allowing the user to view all the songs they have added to their playlist, viewing the average ratings of each song as well to go back to the main screen. 

 

 
<img width="275" alt="Screenshot 2025-06-19 at 13 01 11" src="https://github.com/user-attachments/assets/ea1d1b85-34cf-494a-85d1-ef1f80a8dd2a" />


 

Here below is my source code:

<img width="442" alt="Screenshot 2025-06-19 at 13 01 44" src="https://github.com/user-attachments/assets/55157b69-3924-4f0c-ba18-e52215c8e2cc" />

My first (main) screens code ¼ containing variables and their declarations for my application. 

 <img width="437" alt="Screenshot 2025-06-19 at 13 02 11" src="https://github.com/user-attachments/assets/d8a4fc2a-29a9-4901-b545-6a3f2965c360" />


My first (main) screens code 2/4 which shows how the buttons will work when the user clicks on it. 

<img width="427" alt="Screenshot 2025-06-19 at 13 02 34" src="https://github.com/user-attachments/assets/4fd173b7-dcd2-4dcf-a981-7aebb7daf9c4" />


My first (main) screens code ¾ shows some error handling which would warn the user if they entered an invalid input 

 
<img width="432" alt="Screenshot 2025-06-19 at 13 02 55" src="https://github.com/user-attachments/assets/9c5b3cce-866f-42fe-ab53-e92b3908ed1f" />

 
My first (main) screens code 4/4 which contains the buttons which will navigate the user to the second screen. 

 

In my first (main) screen of the application, the code is allowing the user to add a song by entering the name of the song, the artist whom the song belongs too, a rating for the song as well as any comments they may have for the song. After they have entered their choice, they should be able to click “Add to playlist” button which will add their song to the playlist on the second screen. They also have the choice thereafter to click “Go to Playlist screen” to navigate them to the second screen where all their saved songs are. They also can exit the application by clicking the “Exit” button. 

 <img width="363" alt="Screenshot 2025-06-19 at 13 03 24" src="https://github.com/user-attachments/assets/21d5a747-6f40-4811-8a85-9cc25f332acd" />


My second screens code (1/4) showing all the variables for the buttons used. 

 <img width="313" alt="Screenshot 2025-06-19 at 13 03 57" src="https://github.com/user-attachments/assets/4ffbd8fd-f183-4a76-b271-b2da160be695" />


My seconds screen code (2/3) showing what each of the buttons will do when interacted. 

<img width="484" alt="Screenshot 2025-06-19 at 13 04 18" src="https://github.com/user-attachments/assets/a173354e-c9a8-4aa3-a32f-a85d0e42f283" />


My seconds screens code 3/3 showing how everything will be displayed of what the user had entered on the first (main) screen which would be saved, and appearing on this screen. Error handling is shown as well. 

Screenshots of my app running on emulator: 

 <img width="645" alt="Screenshot 2025-06-19 at 13 05 45" src="https://github.com/user-attachments/assets/a40e8d80-b175-48e4-998c-b518117ce760" />


When the music playlist manager application starts, this is what the user sees. 

<img width="662" alt="Screenshot 2025-06-19 at 13 06 03" src="https://github.com/user-attachments/assets/09db1418-ec3c-460d-9c90-3a73b18718c0" />


They can add add a song by entering the name of the song, the artist whom the song belongs too, a rating for the song as well as any comments they may have for the song. After they have entered their choice, they should be able to click “Add to playlist” button which will add their song to the playlist on the second screen. They also have the choice thereafter to click “Go to Playlist screen” to navigate them to the second screen where all their saved songs are. They also can exit the application by clicking the “Exit” button.  

 <img width="764" alt="Screenshot 2025-06-19 at 13 06 25" src="https://github.com/user-attachments/assets/2d124f6f-fb17-47d1-b762-db9c33dbb280" />


Once the user has added their song by clicking the” Add to playlist” button, a message pops up that says” Song Added!” which lets the user know that their input was successful. 

 <img width="567" alt="Screenshot 2025-06-19 at 13 06 44" src="https://github.com/user-attachments/assets/b023ae20-cc7d-4b66-80b0-02971cade88a" />


IF the user did not enter anything and proceeded to click on the” Add to Playlist” button, a message pops up letting the user know that they should” Please fill in all requested fields. 

 <img width="501" alt="Screenshot 2025-06-19 at 13 07 03" src="https://github.com/user-attachments/assets/37dbf14b-bd76-471d-a006-8b35f3fabc62" />


Once the user clicks” Go to Playlist Screen” they are navigated here to this screen. IF they have not entered any songs in the main screen and they clicked on” Show list of songs”, they will get an error handing message that says” No songs to show” as shown in the above screenshot.

<img width="636" alt="Screenshot 2025-06-19 at 13 07 29" src="https://github.com/user-attachments/assets/399e2762-f4a5-4e9b-9a51-e8dc528b62e4" />


Finally, once the user has clicked back to main screen, it will navigate them back to the main screen. And thus, close the application by clicking “Exit” on the Main screen. 
 
