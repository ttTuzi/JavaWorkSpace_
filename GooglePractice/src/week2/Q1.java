package week2;
import java.io.*;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        String ltxt = "Full Metal Jacket (1987)\n" +
                "Come and See (1985)\n" +
                "Aliens (1986)\n" +
                "Amadeus (1984)\n" +
                "Scarface (1983)\n" +
                "Star Wars: Episode VI - Return of the Jedi (1983)\n" +
                "Das Boot (1981)\n" +
                "Taxi Driver (1976)\n" +
                "The Sting (1973)\n" +
                "A Clockwork Orange (1971)\n" +
                "2001: A Space Odyssey (1968)\n" +
                "For a Few Dollars More (1965)\n" +
                "Lawrence of Arabia (1962)\n" +
                "The Apartment (1960)\n" +
                "North by Northwest (1959)\n" +
                "Vertigo (1958)\n" +
                "Singin' in the Rain (1952)\n" +
                "Ikiru (1952)\n" +
                "Bicycle Thieves (1948)\n" +
                "Double Indemnity (1944)\n" +
                "Citizen Kane (1941)\n" +
                "M (1931)\n" +
                "Metropolis (1927)\n" +
                "The Kid (1921)\n" +
                "Chhichhore (2019)\n" +
                "K.G.F: Chapter 1 (2018)\n" +
                "Green Book (2018)\n" +
                "Three Billboards Outside Ebbing, Missouri (2017)\n" +
                "Talvar (2015)\n" +
                "Baahubali 2: The Conclusion (2017)\n" +
                "Klaus (2019)\n" +
                "Drishyam (2015)\n" +
                "Queen (2013)\n" +
                "Tangerines (2013)\n" +
                "Bhaag Milkha Bhaag (2013)\n" +
                "Gangs of Wasseypur (2012)\n" +
                "Udaan (2010)\n" +
                "Paan Singh Tomar (2012)\n" +
                "The Secret in Their Eyes (2009)\n" +
                "Warrior (2011)\n" +
                "Shutter Island (2010)\n" +
                "Up (2009)\n" +
                "The Wolf of Wall Street (2013)\n" +
                "Chak De! India (2007)\n" +
                "There Will Be Blood (2007)\n" +
                "Pan's Labyrinth (2006)\n" +
                "V for Vendetta (2005)\n" +
                "Rang De Basanti (2006)\n" +
                "Black (2005)\n" +
                "Batman Begins (2005)\n" +
                "Swades (2004)\n" +
                "Downfall (2004)\n" +
                "Howl's Moving Castle (2004)\n" +
                "A Beautiful Mind (2001)\n" +
                "Hera Pheri (2000)\n" +
                "Lock, Stock and Two Smoking Barrels (1998)\n" +
                "L.A. Confidential (1997)\n" +
                "The Bandit (1996)\n" +
                "Heat (1995)\n" +
                "Casino (1995)\n" +
                "Andaz Apna Apna (1994)\n" +
                "Unforgiven (1992)\n" +
                "Indiana Jones and the Last Crusade (1989)\n" +
                "My Neighbor Totoro (1988)\n" +
                "Die Hard (1988)\n" +
                "Ran (1985)\n" +
                "Raging Bull (1980)\n" +
                "Stalker (1979)\n" +
                "The Message (1976)\n" +
                "Sholay (1975)\n" +
                "Monty Python and the Holy Grail (1975)\n" +
                "The Great Escape (1963)\n" +
                "To Kill a Mockingbird (1962)\n" +
                "Yojimbo (1961)\n" +
                "Judgment at Nuremberg (1961)\n" +
                "Some Like It Hot (1959)\n" +
                "Wild Strawberries (1957)\n" +
                "The Seventh Seal (1957)\n" +
                "Rififi (1955)\n" +
                "Dial M for Murder (1954)\n" +
                "Tokyo Story (1953)\n" +
                "Rashomon (1950)\n" +
                "All About Eve (1950)\n" +
                "The Treasure of the Sierra Madre (1948)\n" +
                "To Be or Not to Be (1942)\n" +
                "The Gold Rush (1925)\n" +
                "Sherlock Jr. (1924)\n" +
                "Portrait of a Lady on Fire (2019)\n" +
                "Pink (III) (2016)\n" +
                "A Silent Voice: The Movie (2016)\n" +
                "The Invisible Guest (2016)\n" +
                "The Handmaiden (2016)\n" +
                "Mommy (I) (2014)\n" +
                "Haider (2014)\n" +
                "Wild Tales (2014)\n" +
                "Winter Sleep (2014)\n" +
                "Baahubali: The Beginning (2015)\n" +
                "Gully Boy (2019)\n" +
                "PK (2014)\n" +
                "OMG: Oh My God! (2012)\n" +
                "The Grand Budapest Hotel (2014)\n" +
                "Gone Girl (2014)\n" +
                "Wolf Children (2012)\n" +
                "Hacksaw Ridge (2016)\n" +
                "Inside Out (I) (2015)\n" +
                "Barfi! (2012)\n" +
                "12 Years a Slave (2013)\n" +
                "Rush (I) (2013)\n" +
                "Ford v Ferrari (2019)\n" +
                "Spotlight (I) (2015)\n" +
                "Song of the Sea (2014)\n" +
                "Kahaani (2012)\n" +
                "Zindagi Na Milegi Dobara (2011)\n" +
                "Prisoners (2013)\n" +
                "Mad Max: Fury Road (2015)\n" +
                "A Wednesday (2008)\n" +
                "Gran Torino (2008)\n" +
                "Harry Potter and the Deathly Hallows: Part 2 (2011)\n" +
                "Departures (2008)\n" +
                "Hachi: A Dog's Tale (2009)\n" +
                "Mary and Max (2009)\n" +
                "How to Train Your Dragon (2010)\n" +
                "Elite Squad (2007)\n" +
                "Into the Wild (2007)\n" +
                "No Country for Old Men (2007)\n" +
                "Lage Raho Munna Bhai (2006)\n" +
                "Million Dollar Baby (2004)\n" +
                "Hotel Rwanda (2004)\n" +
                "Tae Guk Gi: The Brotherhood of War (2004)\n" +
                "Before Sunset (2004)\n" +
                "Munna Bhai M.B.B.S. (2003)\n" +
                "Memories of Murder (2003)\n" +
                "Dil Chahta Hai (2001)\n" +
                "Kill Bill: Vol. 1 (2003)\n" +
                "Finding Nemo (2003)\n" +
                "Catch Me If You Can (2002)\n" +
                "Amores Perros (2000)\n" +
                "Neon Genesis Evangelion: The End of Evangelion (1997)\n" +
                "Lagaan: Once Upon a Time in India (2001)\n" +
                "The Sixth Sense (1999)\n" +
                "The Legend of 1900 (1998)\n" +
                "The Truman Show (1998)\n" +
                " Black Cat, White Cat (1998)\n" +
                "The Big Lebowski (1998)\n" +
                "In the Mood for Love (2000)\n" +
                "Trainspotting (1996)\n" +
                "Fargo (1996)\n" +
                "Underground (1995)\n" +
                "La Haine (1995)\n" +
                "Dilwale Dulhania Le Jayenge (1995)\n" +
                "Before Sunrise (1995)\n" +
                "Three Colors: Red (1994)\n" +
                "Chungking Express (1994)\n" +
                "Jurassic Park (1993)\n" +
                "In the Name of the Father (1993)\n" +
                "Raise the Red Lantern (1991)\n" +
                "Dead Poets Society (1989)\n" +
                "The Princess Bride (1987)\n" +
                "Stand by Me (1986)\n" +
                "Platoon (1986)\n" +
                "Paris, Texas (1984)\n" +
                "NausicaÃ¤ of the Valley of the Wind (1984)\n" +
                "The Thing (1982)\n" +
                "Pink Floyd: The Wall (1982)\n" +
                "Fitzcarraldo (1982)\n" +
                "Fanny and Alexander (1982)\n" +
                "Blade Runner (1982)\n" +
                "The Elephant Man (1980)\n" +
                "Monty Python's Life of Brian (1979)\n" +
                "The Deer Hunter (1978)\n" +
                "Rocky (1976)\n" +
                "Network (1976)\n" +
                "Barry Lyndon (1975)\n" +
                "The Mirror (1975)\n" +
                "Chinatown (1974)\n" +
                "Paper Moon (1973)\n" +
                "Cries & Whispers (1972)\n" +
                "Solaris (1972)\n" +
                "Le SamouraÃ¯ (1967)\n" +
                "Cool Hand Luke (1967)\n" +
                "Persona (1966)\n" +
                "Andrei Rublev (1966)\n" +
                "The Battle of Algiers (1966)\n" +
                "The Exterminating Angel (1962)\n" +
                "What Ever Happened to Baby Jane? (1962)\n" +
                "Sanjuro (1962)\n" +
                "The Man Who Shot Liberty Valance (1962)\n" +
                "Ivan's Childhood (1962)\n" +
                "The Virgin Spring (1960)\n" +
                "Inherit the Wind (1960)\n" +
                "The 400 Blows (1959)\n" +
                "Ben-Hur (1959)\n" +
                "The Hidden Fortress (1958)\n" +
                "Sweet Smell of Success (1957)\n" +
                "Nights of Cabiria (1957)\n" +
                "Throne of Blood (1957)\n" +
                "The Bridge on the River Kwai (1957)\n" +
                "On the Waterfront (1954)\n" +
                "The Wages of Fear (1953)\n" +
                "Ace in the Hole (1951)\n" +
                "White Heat (1949)\n" +
                "The Third Man (1949)\n" +
                "The Red Shoes (1948)\n" +
                "The Shop Around the Corner (1940)\n" +
                "Rebecca (1940)\n" +
                "Mr. Smith Goes to Washington (1939)\n" +
                "Gone with the Wind (1939)\n" +
                "La Grande Illusion (1937)\n" +
                "It Happened One Night (1934)\n" +
                "The Passion of Joan of Arc (1928)\n" +
                "The Circus (1928)\n" +
                "Sunrise (1927)\n" +
                "The General (1926)\n" +
                "The Cabinet of Dr. Caligari (1920)\n" +
                "Shoplifters (2018)\n" +
                "Badhaai Ho (2018)\n" +
                "Marriage Story (2019)\n" +
                "Togo (2019)\n" +
                "Airlift (2016)\n" +
                "Bajrangi Bhaijaan (2015)\n" +
                "Baby (I) (2015)\n" +
                "La La Land (2016)\n" +
                "Lion (2016)\n" +
                "The Martian (2015)\n" +
                "Zootopia (2016)\n" +
                "The Tale of The Princess Kaguya (2013)\n" +
                "Wonder (I) (2017)\n" +
                "Special 26 (2013)\n" +
                "Short Term 12 (2013)\n" +
                "The Raid 2 (2014)\n" +
                "The Imitation Game (2014)\n" +
                "Guardians of the Galaxy (2014)\n" +
                "Blade Runner 2049 (2017)\n" +
                "Her (2013)\n" +
                "Bohemian Rhapsody (2018)\n" +
                "The Revenant (2015)\n" +
                "The Perks of Being a Wallflower (2012)\n" +
                "Elite Squad 2: The Enemy Within (2010)\n" +
                "The King's Speech (2010)\n" +
                "The Help (2011)\n" +
                "Deadpool (2016)\n" +
                "Darbareye Elly (2009)\n" +
                "Dev.D (2009)\n" +
                "Ip Man (2008)\n" +
                "My Name Is Khan (2010)\n" +
                "The Breath (2009)\n" +
                "Slumdog Millionaire (2008)\n" +
                "Black Swan (2010)\n" +
                "The Avengers (2012)\n" +
                "Persepolis (2007)\n" +
                "Dallas Buyers Club (2013)\n" +
                "The Pursuit of Happyness (2006)\n" +
                "Blood Diamond (2006)\n" +
                "The Bourne Ultimatum (2007)\n" +
                "3-Iron (2004)\n" +
                "Sin City (2005)\n" +
                "The Diving Bell and the Butterfly (2007)\n" +
                "G.O.R.A. (2004)\n" +
                "Ratatouille (2007)\n" +
                "Casino Royale (2006)\n" +
                "Kill Bill: Vol. 2 (2004)\n" +
                "The Return (2003)\n" +
                "Spring, Summer, Fall, Winter... and Spring (2003)\n" +
                "The Sea Inside (I) (2004)\n" +
                "Cinderella Man (2005)\n" +
                "Kal ho naa ho (2003)\n" +
                "Infernal Affairs (2002)\n" +
                "Pirates of the Caribbean: The Curse of the Black Pearl (2003)\n" +
                "Big Fish (2003)\n" +
                "The Incredibles (2004)\n" +
                "My Sassy Girl (2001)\n" +
                "Dogville (2003)\n" +
                "Vizontele (2001)\n" +
                "Donnie Darko (2001)\n" +
                "Monsters, Inc. (2001)\n" +
                "Magnolia (1999)\n" +
                "Dancer in the Dark (2000)\n" +
                "Mulholland Drive (2001)\n" +
                "The Straight Story (1999)\n" +
                "Perfect Blue (1997)\n" +
                "The Celebration (1998)\n" +
                "Central Station (1998)\n" +
                "The Iron Giant (1999)\n" +
                "Knockin' on Heaven's Door (1997)\n" +
                "Sling Blade (1996)\n" +
                "Secrets & Lies (1996)\n" +
                "12 Monkeys (1995)\n" +
                "Ghost in the Shell (1995)\n" +
                "The Nightmare Before Christmas (1993)\n" +
                "Groundhog Day (1993)\n" +
                "Blood In, Blood Out (1993)\n" +
                "Scent of a Woman (1992)\n" +
                "Aladdin (1992)\n" +
                "JFK (1991)\n" +
                "Nights of Cabiria (1957)\n" +
                "Throne of Blood (1957)\n" +
                "The Bridge on the River Kwai (1957)\n" +
                "On the Waterfront (1954)\n" +
                "The Wages of Fear (1953)\n" +
                "Ace in the Hole (1951)\n" +
                "White Heat (1949)\n" +
                "The Third Man (1949)\n" +
                "The Red Shoes (1948)\n" +
                "The Shop Around the Corner (1940)\n" +
                "Rebecca (1940)\n" +
                "Mr. Smith Goes to Washington (1939)\n" +
                "Gone with the Wind (1939)\n" +
                "La Grande Illusion (1937)\n" +
                "It Happened One Night (1934)\n" +
                "The Passion of Joan of Arc (1928)\n" +
                "The Circus (1928)\n" +
                "Sunrise (1927)\n" +
                "The General (1926)\n" +
                "The Cabinet of Dr. Caligari (1920)\n" +
                "Shoplifters (2018)\n" +
                "Badhaai Ho (2018)\n" +
                "Marriage Story (2019)\n" +
                "Togo (2019)\n" +
                "Airlift (2016)\n" +
                "Bajrangi Bhaijaan (2015)\n" +
                "Baby (I) (2015)\n" +
                "La La Land (2016)\n" +
                "Lion (2016)\n" +
                "The Martian (2015)\n" +
                "Zootopia (2016)\n" +
                "The Tale of The Princess Kaguya (2013)\n" +
                "Wonder (I) (2017)\n" +
                "Special 26 (2013)\n" +
                "Short Term 12 (2013)\n" +
                "The Raid 2 (2014)\n" +
                "The Imitation Game (2014)\n" +
                "Guardians of the Galaxy (2014)\n" +
                "Blade Runner 2049 (2017)\n" +
                "Her (2013)\n" +
                "Bohemian Rhapsody (2018)\n" +
                "The Revenant (2015)\n" +
                "The Perks of Being a Wallflower (2012)\n" +
                "Elite Squad 2: The Enemy Within (2010)\n" +
                "The King's Speech (2010)\n" +
                "The Help (2011)\n" +
                "Deadpool (2016)\n" +
                "Darbareye Elly (2009)\n" +
                "Dev.D (2009)\n" +
                "Ip Man (2008)\n" +
                "My Name Is Khan (2010)\n" +
                "The Breath (2009)\n" +
                "Slumdog Millionaire (2008)\n" +
                "Black Swan (2010)\n" +
                "The Avengers (2012)\n" +
                "Persepolis (2007)\n" +
                "Dallas Buyers Club (2013)\n" +
                "The Pursuit of Happyness (2006)\n" +
                "Blood Diamond (2006)\n" +
                "The Bourne Ultimatum (2007)\n" +
                "3-Iron (2004)\n" +
                "Sin City (2005)\n" +
                "The Diving Bell and the Butterfly (2007)\n" +
                "G.O.R.A. (2004)\n" +
                "Ratatouille (2007)\n" +
                "Casino Royale (2006)\n" +
                "Kill Bill: Vol. 2 (2004)\n" +
                "The Return (2003)\n" +
                "Spring, Summer, Fall, Winter... and Spring (2003)\n" +
                "The Sea Inside (I) (2004)\n" +
                "Cinderella Man (2005)\n" +
                "Kal ho naa ho (2003)\n" +
                "Infernal Affairs (2002)\n" +
                "Pirates of the Caribbean: The Curse of the Black Pearl (2003)\n" +
                "Big Fish (2003)\n" +
                "The Incredibles (2004)\n" +
                "My Sassy Girl (2001)\n" +
                "Dogville (2003)\n" +
                "Vizontele (2001)\n" +
                "Donnie Darko (2001)\n" +
                "Monsters, Inc. (2001)\n" +
                "Magnolia (1999)\n" +
                "Dancer in the Dark (2000)\n" +
                "Mulholland Drive (2001)\n" +
                "The Straight Story (1999)\n" +
                "Perfect Blue (1997)\n" +
                "The Celebration (1998)\n" +
                "Central Station (1998)\n" +
                "The Iron Giant (1999)\n" +
                "Knockin' on Heaven's Door (1997)\n" +
                "Sling Blade (1996)\n" +
                "Secrets & Lies (1996)\n" +
                "12 Monkeys (1995)\n" +
                "Ghost in the Shell (1995)\n" +
                "The Nightmare Before Christmas (1993)\n" +
                "Groundhog Day (1993)\n" +
                "Blood In, Blood Out (1993)\n" +
                "Scent of a Woman (1992)\n" +
                "Aladdin (1992)\n" +
                "JFK (1991)\n" +
                "Nights of Cabiria (1957)\n" +
                "Throne of Blood (1957)\n" +
                "The Bridge on the River Kwai (1957)\n" +
                "On the Waterfront (1954)\n" +
                "The Wages of Fear (1953)\n" +
                "Ace in the Hole (1951)\n" +
                "White Heat (1949)\n" +
                "The Third Man (1949)\n" +
                "The Red Shoes (1948)\n" +
                "The Shop Around the Corner (1940)\n" +
                "Rebecca (1940)\n" +
                "Mr. Smith Goes to Washington (1939)\n" +
                "Gone with the Wind (1939)\n" +
                "La Grande Illusion (1937)\n" +
                "It Happened One Night (1934)\n" +
                "The Passion of Joan of Arc (1928)\n" +
                "The Circus (1928)\n" +
                "Sunrise (1927)\n" +
                "The General (1926)\n" +
                "The Cabinet of Dr. Caligari (1920)\n" +
                "Shoplifters (2018)\n" +
                "Badhaai Ho (2018)\n" +
                "Marriage Story (2019)\n" +
                "Togo (2019)\n" +
                "Airlift (2016)\n" +
                "Bajrangi Bhaijaan (2015)\n" +
                "Baby (I) (2015)\n" +
                "La La Land (2016)\n" +
                "Lion (2016)\n" +
                "The Martian (2015)\n" +
                "Zootopia (2016)\n" +
                "The Tale of The Princess Kaguya (2013)\n" +
                "Wonder (I) (2017)\n" +
                "Special 26 (2013)\n" +
                "Short Term 12 (2013)\n" +
                "The Raid 2 (2014)\n" +
                "The Imitation Game (2014)\n" +
                "Guardians of the Galaxy (2014)\n" +
                "Blade Runner 2049 (2017)\n" +
                "Her (2013)\n" +
                "Bohemian Rhapsody (2018)\n" +
                "The Revenant (2015)\n" +
                "The Perks of Being a Wallflower (2012)\n" +
                "Elite Squad 2: The Enemy Within (2010)\n" +
                "The King's Speech (2010)\n" +
                "The Help (2011)\n" +
                "Deadpool (2016)\n" +
                "Darbareye Elly (2009)\n" +
                "Dev.D (2009)\n" +
                "Ip Man (2008)\n" +
                "My Name Is Khan (2010)\n" +
                "The Breath (2009)\n" +
                "Slumdog Millionaire (2008)\n" +
                "Black Swan (2010)\n" +
                "The Avengers (2012)\n" +
                "Persepolis (2007)\n" +
                "Dallas Buyers Club (2013)\n" +
                "The Pursuit of Happyness (2006)\n" +
                "Blood Diamond (2006)\n" +
                "The Bourne Ultimatum (2007)\n" +
                "3-Iron (2004)\n" +
                "Sin City (2005)\n" +
                "The Diving Bell and the Butterfly (2007)\n" +
                "G.O.R.A. (2004)\n" +
                "Ratatouille (2007)\n" +
                "Casino Royale (2006)\n" +
                "Kill Bill: Vol. 2 (2004)\n" +
                "The Return (2003)\n" +
                "Spring, Summer, Fall, Winter... and Spring (2003)\n" +
                "The Sea Inside (I) (2004)\n" +
                "Cinderella Man (2005)\n" +
                "Kal ho naa ho (2003)\n" +
                "Infernal Affairs (2002)\n" +
                "Pirates of the Caribbean: The Curse of the Black Pearl (2003)\n" +
                "Big Fish (2003)\n" +
                "The Incredibles (2004)\n" +
                "My Sassy Girl (2001)\n" +
                "Dogville (2003)\n" +
                "Vizontele (2001)\n" +
                "Donnie Darko (2001)\n" +
                "Monsters, Inc. (2001)\n" +
                "Magnolia (1999)\n" +
                "Dancer in the Dark (2000)\n" +
                "Mulholland Drive (2001)\n" +
                "The Straight Story (1999)\n" +
                "Perfect Blue (1997)\n" +
                "The Celebration (1998)\n" +
                "Central Station (1998)\n" +
                "The Iron Giant (1999)\n" +
                "Knockin' on Heaven's Door (1997)\n" +
                "Sling Blade (1996)\n" +
                "Secrets & Lies (1996)\n" +
                "12 Monkeys (1995)\n" +
                "Ghost in the Shell (1995)\n" +
                "The Nightmare Before Christmas (1993)\n" +
                "Groundhog Day (1993)\n" +
                "Blood In, Blood Out (1993)\n" +
                "Scent of a Woman (1992)\n" +
                "Aladdin (1992)\n" +
                "JFK (1991)\n" +
                "Nights of Cabiria (1957)\n" +
                "Throne of Blood (1957)\n" +
                "The Bridge on the River Kwai (1957)\n" +
                "On the Waterfront (1954)\n" +
                "The Wages of Fear (1953)\n" +
                "Ace in the Hole (1951)\n" +
                "White Heat (1949)\n" +
                "The Third Man (1949)\n" +
                "The Red Shoes (1948)\n" +
                "The Shop Around the Corner (1940)\n" +
                "One for $199 (1957)\n" +
                "Rebecca (1940)\n" +
                "Mr. Smith Goes to Washington (1939)\n" +
                "Gone with the Wind (1939)\n" +
                "La Grande Illusion (1937)\n" +
                "It Happened One Night (1934)\n" +
                "The Passion of Joan of Arc (1928)\n" +
                "The Circus (1928)\n" +
                "Sunrise (1927)\n" +
                "The General (1926)\n" +
                "The Cabinet of Dr. Caligari (1920)\n" +
                "Shoplifters (2018)\n" +
                "Badhaai Ho (2018)\n" +
                "Marriage Story (2019)\n" +
                "Togo (2019)\n" +
                "Airlift (2016)\n" +
                "Bajrangi Bhaijaan (2015)\n" +
                "Baby (I) (2015)\n" +
                "La La Land (2016)\n" +
                "Lion (2016)\n" +
                "The Martian (2015)\n" +
                "Zootopia (2016)\n" +
                "The Tale of The Princess Kaguya (2013)\n" +
                "Wonder (I) (2017)\n" +
                "Special 26 (2013)\n" +
                "Short Term 12 (2013)\n" +
                "The Raid 2 (2014)\n" +
                "The Imitation Game (2014)\n" +
                "Guardians of the Galaxy (2014)\n" +
                "Blade Runner 2049 (2017)\n" +
                "Her (2013)\n" +
                "Bohemian Rhapsody (2018)\n" +
                "The Revenant (2015)\n" +
                "The Perks of Being a Wallflower (2012)\n" +
                "Elite Squad 2: The Enemy Within (2010)\n" +
                "The King's Speech (2010)\n" +
                "The Help (2011)\n" +
                "Deadpool (2016)\n" +
                "Darbareye Elly (2009)\n" +
                "199 Red Balloons (1957)\n" +
                "Dev.D (2009)\n" +
                "Ip Man (2008)\n" +
                "My Name Is Khan (2010)\n" +
                "The Breath (2009)\n" +
                "Slumdog Millionaire (2008)\n" +
                "Black Swan (2010)\n" +
                "The Avengers (2012)\n" +
                "Persepolis (2007)\n" +
                "Dallas Buyers Club (2013)\n" +
                "The Pursuit of Happyness (2006)\n" +
                "Blood Diamond (2006)\n" +
                "The Bourne Ultimatum (2007)\n" +
                "3-Iron (2004)\n" +
                "Sin City (2005)\n" +
                "The Diving Bell and the Butterfly (2007)\n" +
                "G.O.R.A. (2004)\n" +
                "Ratatouille (2007)\n" +
                "Casino Royale (2006)\n" +
                "Kill Bill: Vol. 2 (2004)\n" +
                "The Return (2003)\n" +
                "Spring, Summer, Fall, Winter... and Spring (2003)\n" +
                "The Sea Inside (I) (2004)\n" +
                "Cinderella Man (2005)\n" +
                "Kal ho naa ho (2003)\n" +
                "Infernal Affairs (2002)\n" +
                "Pirates of the Caribbean: The Curse of the Black Pearl (2003)\n" +
                "Big Fish (2003)\n" +
                "The Incredibles (2004)\n" +
                "My Sassy Girl (2001)\n" +
                "Dogville (2003)\n" +
                "Vizontele (2001)\n" +
                "Donnie Darko (2001)\n" +
                "Monsters, Inc. (2001)\n" +
                "Magnolia (1999)\n" +
                "Dancer in the Dark (2000)\n" +
                "Mulholland Drive (2001)\n" +
                "The Straight Story (1999)\n" +
                "Perfect Blue (1997)\n" +
                "The Celebration (1998)\n" +
                "Central Station (1998)\n" +
                "The Iron Giant (1999)\n" +
                "Knockin' on Heaven's Door (1997)\n" +
                "Sling Blade (1996)\n" +
                "Secrets & Lies (1996)\n" +
                "12 Monkeys (1995)\n" +
                "Ghost in the Shell (1995)\n" +
                "The Nightmare Before Christmas (1993)\n" +
                "Groundhog Day (1993)\n" +
                "Blood In, Blood Out (1993)\n" +
                "Scent of a Woman (1992)\n" +
                "Aladdin (1992)\n" +
                "JFK (1991)\n" +
                "Nights of Cabiria (1957)\n" +
                "Throne of Blood (1957)\n" +
                "(199 Dalmations (1976)\n" +
                "The Bridge on the River Kwai (1957)\n" +
                "On the Waterfront (1954)\n" +
                "The Wages of Fear (1953)\n" +
                "Ace in the Hole (1951)\n" +
                "White Heat (1949)\n" +
                "The Third Man (1949)\n" +
                "The Red Shoes (1948)\n" +
                "The Shop Around the Corner (1940)\n" +
                "Rebecca (1940)\n" +
                "Mr. Smith Goes to Washington (1939)\n" +
                "Gone with the Wind (1939)\n" +
                "La Grande Illusion (1937)\n" +
                "It Happened One Night (1934)\n" +
                "The Passion of Joan of Arc (1928)\n" +
                "The Circus (1928)\n" +
                "Sunrise (1927)\n" +
                "The General (1926)\n" +
                "The Cabinet of Dr. Caligari (1920)\n" +
                "Shoplifters (2018)\n" +
                "Badhaai Ho (2018)\n" +
                "Marriage Story (2019)\n" +
                "Togo (2019)\n" +
                "Airlift (2016)\n" +
                "Bajrangi Bhaijaan (2015)\n" +
                "Baby (I) (2015)\n" +
                "La La Land (2016)\n" +
                "Lion (2016)\n" +
                "Dial  (1976)\n" +
                "The Martian (2015)\n" +
                "Zootopia (2016)\n" +
                "The Tale of The Princess Kaguya (2013)\n" +
                "Wonder (I) (2017)\n" +
                "Special 26 (2013)\n" +
                "Short Term 12 (2013)\n" +
                "The Raid 2 (2014)\n" +
                "The Imitation Game (2014)\n" +
                "Guardians of the Galaxy (2014)\n" +
                "Blade Runner 2049 (2017)\n" +
                "Her (2013)\n" +
                "Bohemian Rhapsody (2018)\n" +
                "The Revenant (2015)\n" +
                "The Perks of Being a Wallflower (2012)\n" +
                "Elite Squad 2: The Enemy Within (2010)\n" +
                "The King's Speech (2010)\n" +
                "The Help (2011)\n" +
                "Deadpool (2016)\n" +
                "Darbareye Elly (2009)\n" +
                "Dev.D (2009)\n" +
                "Ip Man (2008)\n" +
                "My Name Is Khan (2010)\n" +
                "The Breath (2009)\n" +
                "Slumdog Millionaire (2008)\n" +
                "Black Swan (2010)\n" +
                "The Avengers (2012)\n" +
                "Persepolis (2007)\n" +
                "Dallas Buyers Club (2013)\n" +
                "The Pursuit of Happyness (2006)\n" +
                "Blood Diamond (2006)\n" +
                "The Bourne Ultimatum (2007)\n" +
                "3-Iron (2004)\n" +
                "Sin City (2005)\n" +
                "The Diving Bell and the Butterfly (2007)\n" +
                "G.O.R.A. (2004)\n" +
                "Ratatouille (2007)\n" +
                "Casino Royale (2006)\n" +
                "Kill Bill: Vol. 2 (2004)\n" +
                "The Return (2003)\n" +
                "Spring, Summer, Fall, Winter... and Spring (2003)\n" +
                "The Sea Inside (I) (2004)\n" +
                "Cinderella Man (2005)\n" +
                "Kal ho naa ho (2003)\n" +
                "Infernal Affairs (2002)\n" +
                "Pirates of the Caribbean: The Curse of the Black Pearl (2003)\n" +
                "Big Fish (2003)\n" +
                "The Incredibles (2004)\n" +
                "My Sassy Girl (2001)\n" +
                "Dogville (2003)\n" +
                "Vizontele (2001)\n" +
                "Donnie Darko (2001)\n" +
                "Monsters, Inc. (2001)\n" +
                "Magnolia (1999)\n" +
                "Dancer in the Dark (2000)\n" +
                "Mulholland Drive (2001)\n" +
                "The Straight Story (1999)\n" +
                "Perfect Blue (1997)\n" +
                "The Celebration (1998)\n" +
                "Central Station (1998)\n" +
                "The Iron Giant (1999)\n" +
                "Knockin' on Heaven's Door (1997)\n" +
                "Sling Blade (1996)\n" +
                "Secrets & Lies (1996)\n" +
                "12 Monkeys (1995)\n" +
                "Ghost in the Shell (1995)\n" +
                "The Nightmare Before Christmas (1993)\n" +
                "Groundhog Day (1993)\n" +
                "Blood In, Blood Out (1993)\n" +
                "Scent of a Woman (1992)\n" +
                "Aladdin (1992)\n" +
                "JFK (1991)\n" +
                "Nights of Cabiria (1957)\n" +
                "Throne of Blood (1957)\n" +
                "The Bridge on the River Kwai (1957)\n" +
                "On the Waterfront (1954)\n" +
                "The Wages of Fear (1953)\n" +
                "Ace in the Hole (1951)\n" +
                "White Heat (1949)\n" +
                "The Third Man (1949)\n" +
                "The Red Shoes (1948)\n" +
                "The Shop Around the Corner (1940)\n" +
                "Rebecca (1940)\n" +
                "Mr. Smith Goes to Washington (1939)\n" +
                "Gone with the Wind (1939)\n" +
                "La Grande Illusion (1937)\n" +
                "It Happened One Night (1934)\n" +
                "The Passion of Joan of Arc (1928)\n" +
                "The Circus (1928)\n" +
                "Sunrise (1927)\n" +
                "The General (1926)\n" +
                "The Cabinet of Dr. Caligari (1920)\n" +
                "Shoplifters (2018)\n" +
                "Badhaai Ho (2018)\n" +
                "Marriage Story (2019)\n" +
                "Togo (2019)\n" +
                "Airlift (2016)\n" +
                "Bajrangi Bhaijaan (2015)\n" +
                "Baby (I) (2015)\n" +
                "La La Land (2016)\n" +
                "Lion (2016)\n" +
                "The Martian (2015)\n" +
                "Zootopia (2016)\n" +
                "The Tale of The Princess Kaguya (2013)\n" +
                "Wonder (I) (2017)\n" +
                "Special 26 (2013)\n" +
                "Short Term 12 (2013)\n" +
                "The Raid 2 (2014)\n" +
                "The Imitation Game (2014)\n" +
                "Guardians of the Galaxy (2014)\n" +
                "Blade Runner 2049 (2017)\n" +
                "Her (2013)\n" +
                "Bohemian Rhapsody (2018)\n" +
                "The Revenant (2015)\n" +
                "The Perks of Being a Wallflower (2012)\n" +
                "Elite Squad 2: The Enemy Within (2010)\n" +
                "The King's Speech (2010)\n" +
                "The Help (2011)\n" +
                "Deadpool (2016)\n" +
                "Darbareye Elly (2009)\n" +
                "Dev.D (2009)\n" +
                "Ip Man (2008)\n" +
                "My Name Is Khan (2010)\n" +
                "The Breath (2009)\n" +
                "Slumdog Millionaire (2008)\n" +
                "Black Swan (2010)\n" +
                "The Avengers (2012)\n" +
                "Persepolis (2007)\n" +
                "Dallas Buyers Club (2013)\n" +
                "The Pursuit of Happyness (2006)\n" +
                "Blood Diamond (2006)\n" +
                "The Bourne Ultimatum (2007)\n" +
                "3-Iron (2004)\n" +
                "Sin City (2005)\n" +
                "Dial 1995307 For Murder (1976)\n" +
                "The Diving Bell and the Butterfly (2007)\n" +
                "G.O.R.A. (2004)\n" +
                "Ratatouille (2007)\n" +
                "Casino Royale (2006)\n" +
                "Kill Bill: Vol. 2 (2004)\n" +
                "The Return (2003)\n" +
                "Spring, Summer, Fall, Winter... and Spring (2003)\n" +
                "The Sea Inside (I) (2004)\n" +
                "Cinderella Man (2005)\n" +
                "Kal ho naa ho (2003)\n" +
                "Infernal Affairs (2002)\n" +
                "Pirates of the Caribbean: The Curse of the Black Pearl (2003)\n" +
                "Big Fish (2003)\n" +
                "The Incredibles (2004)\n" +
                "My Sassy Girl (2001)\n" +
                "Dogville (2003)\n" +
                "Vizontele (2001)\n" +
                "Donnie Darko (2001)\n" +
                "Monsters, Inc. (2001)\n" +
                "Magnolia (1999)\n" +
                "Dancer in the Dark (2000)\n" +
                "Mulholland Drive (2001)\n" +
                "The Straight Story (1999)\n" +
                "Perfect Blue (1997)\n" +
                "The Celebration (1998)\n" +
                "Central Station (1998)\n" +
                "The Iron Giant (1999)\n" +
                "Knockin' on Heaven's Door (1997)\n" +
                "Sling Blade (1996)\n" +
                "Secrets & Lies (1996)\n" +
                "12 Monkeys (1995)\n" +
                "Ghost in the Shell (1995)\n" +
                "The Nightmare Before Christmas (1993)\n" +
                "Groundhog Day (1993)\n" +
                "Blood In, Blood Out (1993)\n" +
                "Scent of a Woman (1992)\n" +
                "Aladdin (1992)\n" +
                "JFK (1991)\n" +
                "Nights of Cabiria (1957)\n" +
                "Throne of Blood (1957)\n" +
                "The Bridge on the River Kwai (1957)\n" +
                "On the Waterfront (1954)\n" +
                "The Wages of Fear (1953)\n" +
                "Ace in the Hole (1951)\n" +
                "White Heat (1949)\n" +
                "The Third Man (1949)\n" +
                "The Red Shoes (1948)\n" +
                "The Shop Around the Corner (1940)\n" +
                "Rebecca (1940)\n" +
                "Mr. Smith Goes to Washington (1939)\n" +
                "Gone with the Wind (1939)\n" +
                "La Grande Illusion (1937)\n" +
                "It Happened One Night (1934)\n" +
                "The Passion of Joan of Arc (1928)\n" +
                "The Circus (1928)\n" +
                "Sunrise (1927)\n" +
                "The General (1926)\n" +
                "The Cabinet of Dr. Caligari (1920)\n" +
                "Shoplifters (2018)\n" +
                "Badhaai Ho (2018)\n" +
                "Marriage Story (2019)\n" +
                "Togo (2019)\n" +
                "Airlift (2016)\n" +
                "Bajrangi Bhaijaan (2015)\n" +
                "Baby (I) (2015)\n" +
                "La La Land (2016)\n" +
                "Lion (2016)\n" +
                "The Martian (2015)\n" +
                "Zootopia (2016)\n" +
                "The Tale of The Princess Kaguya (2013)\n" +
                "Wonder (I) (2017)\n" +
                "The Perks of Being a Wallflower (2012)\n" +
                "Elite Squad 2: The Enemy Within (2010)\n" +
                "The King's Speech (2010)\n" +
                "The Help (2011)\n" +
                "Deadpool (2016)\n" +
                "Darbareye Elly (2009)\n" +
                "Dev.D (2009)\n" +
                "Ip Man (2008)\n" +
                "My Name Is Khan (2010)\n" +
                "The Breath (2009)\n" +
                "Slumdog Millionaire (2008)\n" +
                "Black Swan (2010)\n" +
                "The Avengers (2012)\n" +
                "Persepolis (2007)\n" +
                "Dallas Buyers Club (2013)\n" +
                "The Pursuit of Happyness (2006)\n" +
                "Blood Diamond (2006)\n" +
                "The Bourne Ultimatum (2007)\n" +
                "3-Iron (2004)\n" +
                "Sin City (2005)\n" +
                "The Diving Bell and the Butterfly (2007)\n" +
                "G.O.R.A. (2004)\n" +
                "Ratatouille (2007)\n" +
                "Casino Royale (2006)\n" +
                "Kill Bill: Vol. 2 (2004)\n" +
                "The Return (2003)\n" +
                "Spring, Summer, Fall, Winter... and Spring (2003)\n" +
                "The Sea Inside (I) (2004)\n" +
                "Cinderella Man (2005)\n" +
                "Kal ho naa ho (2003)\n" +
                "Infernal Affairs (2002)\n" +
                "Pirates of the Caribbean: The Curse of the Black Pearl (2003)\n" +
                "Big Fish (2003)\n" +
                "The Incredibles (2004)\n" +
                "My Sassy Girl (2001)\n" +
                "Dogville (2003)\n" +
                "Vizontele (2001)\n" +
                "Donnie Darko (2001)\n" +
                "Monsters, Inc. (2001)\n" +
                "Magnolia (1999)\n" +
                "Dancer in the Dark (2000)\n" +
                "Mulholland Drive (2001)\n" +
                "The Straight Story (1999)\n" +
                "Perfect Blue (1997)\n" +
                "The Celebration (1998)\n" +
                "Central Station (1998)\n" +
                "The Iron Giant (1999)\n" +
                "Knockin' on Heaven's Door (1997)\n" +
                "Sling Blade (1996)\n" +
                "Secrets & Lies (1996)\n" +
                "12 Monkeys (1995)\n" +
                "Ghost in the Shell (1995)\n" +
                "The Nightmare Before Christmas (1993)\n" +
                "Groundhog Day (1993)\n" +
                "Blood In, Blood Out (1993)\n" +
                "Scent of a Woman (1992)\n" +
                "Aladdin (1992)\n" +
                "JFK (1991)\n" +
                "Nights of Cabiria (1957)\n" +
                "Throne of Blood (1957)";

        String stxt = "The Shawshank Redemption (1994)\n" +
                "The Godfather (1972)\n" +
                "The Dark Knight (2008)\n" +
                "The Godfather: Part II (1974)\n" +
                "The Lord of the Rings: The Return of the King (2003)\n" +
                "Pulp Fiction (1994)\n" +
                "Schindler's List (1993)\n" +
                "12 Angry Men (1957)\n" +
                "Inception (2010)\n" +
                "Fight Club (1999)\n" +
                "The Lord of the Rings: The Fellowship of the Ring (2001)\n" +
                "Forrest Gump (1994)\n" +
                "The Good, the Bad and the Ugly (1966)\n" +
                "Hamilton (2020)\n" +
                "The Lord of the Rings: The Two Towers (2002)\n" +
                "The Matrix (1999)\n" +
                "Goodfellas (1990)\n" +
                "Star Wars: Episode V - The Empire Strikes Back (1980)\n" +
                "One Flew Over the Cuckoo's Nest (1975)\n" +
                "Parasite (2019)\n" +
                "Interstellar (2014)\n" +
                "City of God (2002)\n" +
                "Spirited Away (2001)\n" +
                "Saving Private Ryan (1998)\n" +
                "The Green Mile (1999)\n" +
                "Life Is Beautiful (1997)\n" +
                "Se7en (1995)\n" +
                "The Silence of the Lambs (1991)\n" +
                "Star Wars: Episode IV - A New Hope (1977)\n" +
                "Harakiri (1962)\n" +
                "Seven Samurai (1954)\n" +
                "It's a Wonderful Life (1946)\n" +
                "Joker (2019)\n" +
                "Whiplash (2014)\n" +
                "The Intouchables (2011)\n" +
                "The Prestige (2006)\n" +
                "The Departed (2006)\n" +
                "The Pianist (2002)\n" +
                "Gladiator (2000)\n" +
                "American History X (1998)\n" +
                "The Usual Suspects (1995)\n" +
                "LÃ©on: The Professional (1994)\n" +
                "The Lion King (1994)\n" +
                "Terminator 2: Judgment Day (1991)\n" +
                "Cinema Paradiso (1988)\n" +
                "Grave of the Fireflies (1988)\n" +
                "Back to the Future (1985)\n" +
                "Anand (1971)\n" +
                "Once Upon a Time in the West (1968)\n" +
                "Psycho (1960)\n" +
                "Casablanca (1942)\n" +
                "Modern Times (1936)\n" +
                "City Lights (1931)\n" +
                "Capernaum (2018)\n" +
                "Ayla: The Daughter of War (2017)\n" +
                "Your Name. (2016)\n" +
                "Dangal (2016)\n" +
                "Spider-Man: Into the Spider-Verse (2018)\n" +
                "Avengers: Endgame (2019)\n" +
                "Avengers: Infinity War (2018)\n" +
                "Coco (I) (2017)\n" +
                "Django Unchained (2012)\n" +
                "The Dark Knight Rises (2012)\n" +
                "3 Idiots (2009)\n" +
                "Like Stars on Earth (2007)\n" +
                "WALLÂ·E (2008)\n" +
                "The Lives of Others (2006)\n" +
                "Oldboy (2003)\n" +
                "Memento (2000)\n" +
                "Princess Mononoke (1997)\n" +
                "Once Upon a Time in America (1984)\n" +
                "Raiders of the Lost Ark (1981)\n" +
                "The Shining (1980)\n" +
                "Apocalypse Now (1979)\n" +
                "Alien (1979)\n" +
                "High and Low (1963)\n" +
                "Dr. Strangelove or: How I Learned to Stop Worrying and Love the Bomb (1964)\n" +
                "Witness for the Prosecution (1957)\n" +
                "Paths of Glory (1957)\n" +
                "Rear Window (1954)\n" +
                "Sunset Blvd. (1950)\n" +
                "The Great Dictator (1940)\n" +
                "1917 (2019)\n" +
                "Uri: The Surgical Strike (2019)\n" +
                "Tumbbad (2018)\n" +
                "Andhadhun (2018)\n" +
                "Drishyam (2013)\n" +
                "The Hunt (2012)\n" +
                "A Separation (2011)\n" +
                "Incendies (2010)\n" +
                "7 Kogustaki Mucize (2019)\n" +
                "My Father and My Son (2005)\n" +
                "Toy Story 3 (2010)\n" +
                "Inglourious Basterds (2009)\n" +
                "American Beauty (1999)\n" +
                "Good Will Hunting (1997)\n" +
                "Children of Heaven (1997)\n" +
                "Toy Story (1995)\n" +
                "Braveheart (1995)\n" +
                "Reservoir Dogs (1992)";
        int s = count(stxt);
        System.out.println(s);
        System.out.println(count(ltxt)+count(stxt));

    }


    public static int count(String Text){
        int x=0;
        for(int i=0;i<Text.length()-5;i++){
            String add ="";
            while(Text.charAt(i)!='(' && Text.charAt(i+5)!=')'){
                add = add+Text.charAt(i);
                i+=5;
            }
           /* if(add.charAt(i)=='A'||add.charAt(i)=='T'||add.charAt(i)=='L'){
                x++;
            }*/

        }
        return x;
    }

}
