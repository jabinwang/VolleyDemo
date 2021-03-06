package cnc.cad.myvolleydemo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import cnc.cad.myvolleydemo.R;
import cnc.cad.myvolleydemo.adapter.ImageBaseAdapter;
import cnc.cad.myvolleydemo.adapter.NetworkImageViewAdapter;
import cnc.cad.myvolleydemo.util.Constants;


public class NetworkImageViewFragment extends Fragment{
	public static final int INDEX=23;
	
	private String[] imageUrlArray = Constants.IMAGE_URLS;

	private GridView gvCar;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fr_image_request, container,false);

		gvCar = (GridView) view.findViewById(R.id.gv_car);
		ImageBaseAdapter adapter = new NetworkImageViewAdapter(getActivity(),imageUrlArray);
		gvCar.setAdapter(adapter);

		return view;
	}
}
