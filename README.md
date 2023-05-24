# DiscordMusicBot

A Discord Bot that adds music player functionality to a voice chat, akin to the Rhythm bot.

## Description

A Discord bot written in Java using [JDA](https://github.com/DV8FromTheWorld/JDA) and [Lavaplayer](https://github.com/sedmelluq/lavaplayer) which joins a voice chat, plays music through the voice channel, with additional commands to stop, skip, repeat, list track now playing and list song queue.

## Getting Started

### Dependencies

* Gradle 2.0 or later
* Java 8 or later
* A Discord account, with a private server with developer mode enabled.

### Installing & Setting up bot on Discord Developer Portal

* After downloading the code from this repo, navigate to the root directory of the project and run `./gradlew build` in the terminal
* You will also need to register your version of this bot on the [Discord Developer Portal](https://discord.com/developers/applications)
* Navigate to the 'Bot' tab after creating a new application. Create a new Token, which you'll want to take note of. 
* Navigate to OAuth2 -> URL Generator, and tick the 'bot' and 'applications.commands' scopes, and the 'Administrator' bot permissions.
* A URL will then be generated that when searched will allow the allocation of a bot to a server. Allocate it to your test server.

### Executing program

* To link the code downloaded to the bot on your server, you need to specify the token you created and saved earlier. 
* This can either be done by replacing `Token.discordToken` on line 11 of Main.java with a String containing your Token, or through creating a simple Token class as shown below:
```
package core;

public class Token {
    static String discordToken = "(your token here)";
}
```
* Rebuild the program using `./gradlew build` or functionality in your IDE.

## Functionality
<strong>/play</strong> (song name/ url here) <br> 
* Will either access the URL and play the song, or will search Youtube for the top result of the entered keywords and play that.
* If something else is already playing, it will add the song to a queue to be played after the current song finishes or is skipped. <br>
<strong>/queue</strong> <br>
* Returns the names of all songs currently in the queue. <br>
<strong>/nowplaying</strong> <br>
* Returns the name, author and URL of the song currently being played. <br>
<strong>/skip</strong> <br>
* Skips the currently playing song, either playing the next song in the queue or stopping play if there is nothing else in the queue. <br>
<strong>/repeat</strong> <br>
* A toggle (set to false by default) which repeats a song once its finished. <br>
<strong>/stop</strong> <br>
* Stops songs playing and clears queue. <br>

### Known issues
* After <strong>/stop</strong> is used, bot will sometimes be unable to start playing again. 
* As a short term fix, leave the chat, the bot will then leave, then rejoin and /play.

## Authors
Contributor - [JWBrunkow](https://www.linkedin.com/in/jwbrunkow)

## Version History
* 1
    * Initial Release

## Acknowledgments
* The creators of [Rythm](https://www.theverge.com/2021/9/12/22669502/youtube-discord-rythm-music-bot-closure) and [Groovy](https://www.theverge.com/2021/8/24/22640024/youtube-discord-groovy-music-bot-closure)
* JDA tutorials by [Kody Simpson](https://www.youtube.com/@KodySimpson)
