# Nearest Root Server Finder

This is a basic project that finds the nearest root server(s) according to your current location.

This project is written in Java 17.

This project is using [GeoBytes][geobytes-homepage]'s [Get Nearby Cities API][geobytes-get-nearby-cities-api-page] to get the nearby cities according to your current location.

Then, it uses your current city and [Root Servers][root-servers-homepage] to find the nearest root servers data. You can reach all root servers data that are exported from [Root Servers][root-servers-homepage] under [Root Servers Data][root-servers-data] folder as json files.

> **Important**
> 
> You can change the radius parameter within the GET_NEARBY_CITIES_URI attribute in the [Constants][constants-file] file in order to update the nearby cities.

## How to Contribute

For the contributor covenant to this project, please check the Code of Conduct file.

[![Contributor Covenant][contributor-covenant]](CODE_OF_CONDUCT.md)

[geobytes-homepage]: https://geobytes.com
[geobytes-get-nearby-cities-api-page]: https://geobytes.com/get-nearby-cities-api/
[root-servers-homepage]: https://root-servers.org/
[contributor-covenant]: https://img.shields.io/badge/Contributor%20Covenant-2.1-4baaaa.svg
[root-servers-data]: resources/root-servers-data
[constants-file]: src/Constants.java