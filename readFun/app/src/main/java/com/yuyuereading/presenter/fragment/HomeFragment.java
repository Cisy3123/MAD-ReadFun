package com.yuyuereading.presenter.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.format.Time;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.yuyuereading.presenter.activity.BookListActivity;
import com.yuyuereading.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link HomeFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {
    HomeFragment homeFragment;

    private View view;
    private Button Allanbooklist;
    private Button Oscarbooklist;
    private Button Maobooklist;
    private Button Nobelbooklist;

    private String mParam1;
    private String mParam2;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        view = inflater.inflate(R.layout.activity_home, container, false);
        initView();
        return view;
    }

    private void initView() {
        Allanbooklist=view.findViewById(R.id.Allan_book_list);
        Oscarbooklist=view.findViewById(R.id.Oscar_book_list);
        Maobooklist=view.findViewById(R.id.Mao_book_list);
        Nobelbooklist=view.findViewById(R.id.Nobel_book_list);

        Allanbooklist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), BookListActivity.class);
                intent.putExtra("type","allan");
                startActivity(intent);
            }
        });

        Oscarbooklist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),BookListActivity.class);
                intent.putExtra("type","oscar");
                startActivity(intent);
            }
        });

        Maobooklist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),BookListActivity.class);
                intent.putExtra("type","mao");
                startActivity(intent);
            }
        });

        Nobelbooklist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),BookListActivity.class);
                intent.putExtra("type","nobel");
                startActivity(intent);
            }
        });

        TextView date=view.findViewById(R.id.date);

        Time t=new Time();
        t.setToNow(); // 取得系统时间。
        int year=t.year;
        int month = t.month+1;
        int day = t.monthDay;
        int weekDay=t.weekDay;
        String weekDayZh;
        switch (weekDay){
            case 1:
                weekDayZh="一";
                break;
            case 2:
                weekDayZh="二";
                break;
            case 3:
                weekDayZh="三";
                break;
            case 4:
                weekDayZh="四";
                break;
            case 5:
                weekDayZh="五";
                break;
            case 6:
                weekDayZh="六";
                break;
            default:
                weekDayZh="日";
                break;
        }
        date.setText(year+"年"+month+"月"+day+"日   星期"+weekDayZh);
    }
    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
