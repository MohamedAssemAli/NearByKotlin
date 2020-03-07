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
        val BASE_URL = "https://api.foursquare.com/v2/"
        val LL = "ll"
        val CLIENT_ID = "client_id"
        val ID = "KJ5KJ0Q4GBFAR5MFM2DP0BTH0CAGOBGFSAXI034VXN5N5B1S"
        val CLIENT_SECRET = "client_secret"
        val SECRET = "2CSX2PIGUL0HJUQKV0KSDZKAU2P2KKUJD4SIXGMTJJVCF3L5"
        val VERSION = "v"
        val RADIUS = "radius"
        val RADIUS_VALUE = "500"
        val RESPONSE = "response"
        val GROUPS = "groups"
        val ITEMS = "items"
        val VENUE = "venue"
        val VENUE_ID = "venue_id"
        val PHOTOS = "photos"
    }
}
