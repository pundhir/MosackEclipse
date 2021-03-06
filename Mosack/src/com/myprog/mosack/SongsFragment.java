package com.myprog.mosack;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class SongsFragment extends Fragment implements OnItemClickListener {

	private ListView songListView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.songsfragment, container,
				false);
		songListView = (ListView) rootView.findViewById(R.id.song_list);

		songListView.setOnItemClickListener(this);
		SongAdapter songAdt = new SongAdapter(getActivity(),
				MainActivity.songList);
		songListView.setAdapter(songAdt);
		return rootView;
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		
		((MainActivity)getActivity()).playSelectedSong(position);
		Toast.makeText(getActivity(), "Song selected", Toast.LENGTH_SHORT).show();
		
	}
}
