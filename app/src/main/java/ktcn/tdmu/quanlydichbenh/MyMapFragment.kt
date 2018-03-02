package ktcn.tdmu.quanlydichbenh

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

/**
 * Created by DELL on 02/03/2018.
 */
class MyMapFragment : SupportMapFragment(), OnMapReadyCallback {


    private lateinit var mMap:GoogleMap
    //Phương thức xử lý bản đồ từ interface OnMapReadyCallback
    override fun onMapReady(p0: GoogleMap) {
        mMap = p0

        // Add a marker and move the camera
        val place1 = LatLng(10.980733, 106.674436)
        mMap.addMarker(MarkerOptions().position(place1).title("Đại học Thủ Dầu Một"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(place1))
        mMap.mapType=GoogleMap.MAP_TYPE_HYBRID
        mMap.moveCamera(CameraUpdateFactory.zoomTo(15f))

        val place2 = LatLng(10.979306, 106.675090)
        mMap.addMarker(MarkerOptions().position(place2).title("Open IT Lab Đại học Thủ Dầu Một"))
    }
}