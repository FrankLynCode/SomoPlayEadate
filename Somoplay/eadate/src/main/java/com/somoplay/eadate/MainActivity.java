package com.somoplay.eadate;

import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.somoplay.eadate.home.TabFragmentHome;
import com.somoplay.eadate.search.TabFragmentSearch;
import com.somoplay.eadate.message.TabFragmentMessage;
import com.somoplay.eadate.contact.TabFragmentContact;
import com.somoplay.eadate.me.TabFragmentMe;

import com.somoplay.somotab.ChangeColorIconWithText;
import com.somoplay.somotab.MainTabActivity;
import com.somoplay.somotab.TabFragment;

public class MainActivity extends MainTabActivity//ActionBarActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        initTabView();

    }

    private void initTabView(){
        int color = 0xFF00FF00;//0xFF45C01A;

        ChangeColorIconWithText one = mTabIndicators.get(0);
        one.mText = "Home2";
        one.mColor = color;
        one.mIconBitmap = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.ic_menu_emoticons);
        one.refresh();

        ChangeColorIconWithText two = mTabIndicators.get(1);
        two.mText = "Search2";
        two.mColor = color;
        two.mIconBitmap = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.ic_menu_friendslist);
        two.refresh();

        ChangeColorIconWithText three = mTabIndicators.get(2);
        three.mText = "Message2";
        three.mColor = color;
        three.mIconBitmap = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.ic_menu_start_conversation);
        three.refresh();

        ChangeColorIconWithText four = mTabIndicators.get(3);
        four.mText = "Contact2";
        four.mColor = color;
        four.mIconBitmap = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.ic_menu_friendslist);
        four.refresh();

        ChangeColorIconWithText five = mTabIndicators.get(4);
        five.mText = "Me2";
        five.mColor = color;
        five.mIconBitmap = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.ic_menu_allfriends);
        five.refresh();
    }

    @Override
    protected void initTabFragment()
    {
        TabFragmentHome tabFragmentHome = new TabFragmentHome();
        Bundle bundleHome = new Bundle();
        bundleHome.putString(TabFragment.TITLE, "Home2");
        tabFragmentHome.setArguments(bundleHome);
        mTabs.add(tabFragmentHome);

        TabFragmentSearch tabFragmentSearch = new TabFragmentSearch();
        Bundle bundleSearch = new Bundle();
        bundleSearch.putString(TabFragment.TITLE, "Search2");
        tabFragmentSearch.setArguments(bundleSearch);
        mTabs.add(tabFragmentSearch);

        TabFragmentMessage tabFragmentMessage = new TabFragmentMessage();
        Bundle bundleMessage = new Bundle();
        bundleMessage.putString(TabFragment.TITLE, "Message2");
        tabFragmentMessage.setArguments(bundleMessage);
        mTabs.add(tabFragmentMessage);

        TabFragmentContact tabFragmentContact = new TabFragmentContact();
        Bundle bundleContact = new Bundle();
        bundleContact.putString(TabFragment.TITLE, "Contact2");
        tabFragmentContact.setArguments(bundleContact);
        mTabs.add(tabFragmentContact);

        TabFragmentMe tabFragmentMe = new TabFragmentMe();
        Bundle bundleMe = new Bundle();
        bundleMe.putString(TabFragment.TITLE, "Me2");
        tabFragmentMe.setArguments(bundleMe);
        mTabs.add(tabFragmentMe);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
