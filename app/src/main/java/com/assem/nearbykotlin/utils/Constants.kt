package com.assem.nearbykotlin.utils

class Constants {

    // END_POINTS

    // Explore end point
    /*
     https://api.foursquare.com/v2/venues/explore?
     ll=29.978391,30.954928
     &client_id=WIYK400JVZ2MZ2UASKFQFKBRXYNBQZMVIKFHW1ZME43FGSG0
     &client_secret=PKGEAAH4M25CDNU1HSTVCE5U3T5GQIQISZEVG0CVQ5HY22CB
     &v=20200215
     &radius=500
     */

    // Photos end point
    /*
    https://api.foursquare.com/v2/venues/{venue_id}/photos?
    client_id=WIYK400JVZ2MZ2UASKFQFKBRXYNBQZMVIKFHW1ZME43FGSG0
    &client_secret=PKGEAAH4M25CDNU1HSTVCE5U3T5GQIQISZEVG0CVQ5HY22CB
    &v=20200215

     */
    // photo url
    /*
    https://fastly.4sqi.net/img/general/720x540/3871084_dyOWRHNigS0wzBIyA9H91CuoO8JAkmjTCoyU8EFLw4U.jpg
     */

    // END_POINTS
// Explore end point
    /*
     https://api.foursquare.com/v2/venues/explore?
     ll=29.978391,30.954928
     &client_id=WIYK400JVZ2MZ2UASKFQFKBRXYNBQZMVIKFHW1ZME43FGSG0
     &client_secret=PKGEAAH4M25CDNU1HSTVCE5U3T5GQIQISZEVG0CVQ5HY22CB
     &v=20200215
     &radius=500
     */
// Photos end point
    /*
    https://api.foursquare.com/v2/venues/{venue_id}/photos?
    client_id=WIYK400JVZ2MZ2UASKFQFKBRXYNBQZMVIKFHW1ZME43FGSG0
    &client_secret=PKGEAAH4M25CDNU1HSTVCE5U3T5GQIQISZEVG0CVQ5HY22CB
    &v=20200215

     */

    // photo url
    /*
    https://fastly.4sqi.net/img/general/720x540/3871084_dyOWRHNigS0wzBIyA9H91CuoO8JAkmjTCoyU8EFLw4U.jpg
     */
    companion object {
        const val BASE_URL = "https://api.foursquare.com/v2/"
        const val EXPLORE_END_POINT = "venues/explore"
        const val PHOTOS_END_POINT = "venues/{venue_id}/photos"
        const val LL = "ll"
        const val CLIENT_ID = "client_id"
        const val ID = "QI3JN03II2AEFXVUZWUWTDLUWBTRSHXJLPJDPWZ0V0QY2DA5"
        const val CLIENT_SECRET = "client_secret"
        const val SECRET = "JI23SHUX4JYSPJNLKDMYTZFEVSLBTX2KKVYVSTJKFBFIQKGZ"
        const val VERSION = "v"
        const val RADIUS = "radius"
        const val RADIUS_VALUE = "500"
        const val RESPONSE = "response"
        const val GROUPS = "groups"
        const val ITEMS = "items"
        const val VENUE = "venue"
        const val VENUE_ID = "venue_id"
        const val PHOTOS = "photos"
    }
}
