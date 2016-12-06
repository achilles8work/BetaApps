package com.elpsycongroo.abhishek.betaapps_upload;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by abhishek on 20/11/16.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private static ArrayList<DataModel> dataSet;


    public Adapter(ArrayList<DataModel> dataModel) {
        dataSet = dataModel;
    }


    @Override
    public Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item,null);

        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(Adapter.ViewHolder holder, int position) {
        DataModel dm = dataSet.get(position);
        holder.appName.setText(dm.getAppName());
        holder.appLogo.setImageResource(dm.getAppLogo());
        holder.data = dm;
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView appName;
        public ImageView appLogo;

        public  DataModel data;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);

            appName = (TextView) itemLayoutView.findViewById(R.id.appName);
            appLogo = (ImageView) itemLayoutView.findViewById(R.id.appLogo);

            itemLayoutView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    if (data.getAppName() == "Google") {
                        String url = "https://play.google.com/apps/testing/com.google.android.googlequicksearchbox";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        view.getContext().startActivity(intent);
                        Toast.makeText(view.getContext(), "App is:" + data.getAppName(), Toast.LENGTH_SHORT).show();
                    }

                    else if (data.getAppName() == "Google Maps") {
                        String url = "https://play.google.com/apps/testing/com.google.android.apps.maps";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        view.getContext().startActivity(intent);
                        Toast.makeText(view.getContext(), "App is:" + data.getAppName(), Toast.LENGTH_SHORT).show();
                    }

                    else if (data.getAppName() == "HERE WeGo - City Navigation") {
                        String url = "https://play.google.com/apps/testing/com.here.app.maps";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        view.getContext().startActivity(intent);
                        Toast.makeText(view.getContext(), "App is:" + data.getAppName(), Toast.LENGTH_SHORT).show();
                    }

                    else if (data.getAppName() == "Pushbullet") {
                        String url = "https://play.google.com/apps/testing/com.pushbullet.android";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        view.getContext().startActivity(intent);
                        Toast.makeText(view.getContext(), "App is:" + data.getAppName(), Toast.LENGTH_SHORT).show();
                    }

                    else if (data.getAppName() == "Facebook") {
                        String url = "https://play.google.com/apps/testing/com.facebook.katana/";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        view.getContext().startActivity(intent);
                        Toast.makeText(view.getContext(), "App is:" + data.getAppName(), Toast.LENGTH_SHORT).show();
                    }

                    else if (data.getAppName() == "Messenger") {
                        String url = "https://play.google.com/apps/testing/com.facebook.orca";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        view.getContext().startActivity(intent);
                        Toast.makeText(view.getContext(), "App is:" + data.getAppName(), Toast.LENGTH_SHORT).show();
                    }

                    else if (data.getAppName() == "Instagram") {
                        String url = "https://play.google.com/apps/testing/com.instagram.android";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        view.getContext().startActivity(intent);
                        Toast.makeText(view.getContext(), "App is:" + data.getAppName(), Toast.LENGTH_SHORT).show();
                    }

                    else if (data.getAppName() == "Whatsapp") {
                        String url = "https://play.google.com/apps/testing/com.whatsapp";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        view.getContext().startActivity(intent);
                        Toast.makeText(view.getContext(), "App is:" + data.getAppName(), Toast.LENGTH_SHORT).show();
                    }

                    else if (data.getAppName() == "Snapchat") {
                        String url = "https://play.google.com/apps/testing/com.snapchat.android";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        view.getContext().startActivity(intent);
                        Toast.makeText(view.getContext(), "App is:" + data.getAppName(), Toast.LENGTH_SHORT).show();
                    }

                    else if (data.getAppName() == "Tumblr") {
                        String url = "https://play.google.com/apps/testing/com.tumblr";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        view.getContext().startActivity(intent);
                        Toast.makeText(view.getContext(), "App is:" + data.getAppName(), Toast.LENGTH_SHORT).show();
                    }

                    else if (data.getAppName() == "Drippler - Tech Support & Tips") {
                        String url = "https://play.google.com/apps/testing/com.drippler.android.updates";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        view.getContext().startActivity(intent);
                        Toast.makeText(view.getContext(), "App is:" + data.getAppName(), Toast.LENGTH_SHORT).show();
                    }

                    else if (data.getAppName() == "MX Player") {
                        String url = "https://play.google.com/apps/testing/com.mxtech.videoplayer.ad";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        view.getContext().startActivity(intent);
                        Toast.makeText(view.getContext(), "App is:" + data.getAppName(), Toast.LENGTH_SHORT).show();
                    }

                    else if (data.getAppName() == "VLC") {
                        String url = "https://play.google.com/apps/testing/org.videolan.vlc";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        view.getContext().startActivity(intent);
                        Toast.makeText(view.getContext(), "App is:" + data.getAppName(), Toast.LENGTH_SHORT).show();
                    }

                    else if (data.getAppName() == "PicsArt Photo Studio") {
                        String url = "https://play.google.com/apps/testing/com.picsart.studio";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        view.getContext().startActivity(intent);
                        Toast.makeText(view.getContext(), "App is:" + data.getAppName(), Toast.LENGTH_SHORT).show();
                    }

                    else if (data.getAppName() == "PhotoSync - Transfer Photos") {
                        String url = "https://play.google.com/apps/testing/com.touchbyte.photosync";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        view.getContext().startActivity(intent);
                        Toast.makeText(view.getContext(), "App is:" + data.getAppName(), Toast.LENGTH_SHORT).show();
                    }

                    else if (data.getAppName() == "ibVPN - Fast & Unlimited VPN") {
                        String url = "https://play.google.com/apps/testing/com.ibvpn.client";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        view.getContext().startActivity(intent);
                        Toast.makeText(view.getContext(), "App is:" + data.getAppName(), Toast.LENGTH_SHORT).show();
                    }

                    else if (data.getAppName() == "Evernote") {
                        String url = "https://play.google.com/apps/testing/com.evernote";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        view.getContext().startActivity(intent);
                        Toast.makeText(view.getContext(), "App is:" + data.getAppName(), Toast.LENGTH_SHORT).show();
                    }

                    else if (data.getAppName() == "Modern Strike Online") {
                        String url = "https://play.google.com/apps/testing/com.gamedevltd.modernstrike";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        view.getContext().startActivity(intent);
                        Toast.makeText(view.getContext(), "App is:" + data.getAppName(), Toast.LENGTH_SHORT).show();
                    }

                    else if (data.getAppName() == "Action Launcher") {
                        String url = "https://play.google.com/apps/testing/com.actionlauncher.playstore";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        view.getContext().startActivity(intent);
                        Toast.makeText(view.getContext(), "App is:" + data.getAppName(), Toast.LENGTH_SHORT).show();
                    }

                    else if (data.getAppName() == "Greenify") {
                        String url = "https://play.google.com/apps/testing/com.oasisfeng.greenify";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        view.getContext().startActivity(intent);
                        Toast.makeText(view.getContext(), "App is:" + data.getAppName(), Toast.LENGTH_SHORT).show();
                    }

                    else if (data.getAppName() == "Malwarebytes Anti-Malware") {
                        String url = "https://play.google.com/apps/testing/org.malwarebytes.antimalware";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        view.getContext().startActivity(intent);
                        Toast.makeText(view.getContext(), "App is:" + data.getAppName(), Toast.LENGTH_SHORT).show();
                    }

                    else if (data.getAppName() == "Poweramp Music Player") {
                        String url = "https://play.google.com/apps/testing/com.maxmpz.audioplayer";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        view.getContext().startActivity(intent);
                        Toast.makeText(view.getContext(), "App is:" + data.getAppName(), Toast.LENGTH_SHORT).show();
                    }

                    else if (data.getAppName() == "Sleep as Android") {
                        String url = "https://play.google.com/apps/testing/com.urbandroid.sleep";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        view.getContext().startActivity(intent);
                        Toast.makeText(view.getContext(), "App is:" + data.getAppName(), Toast.LENGTH_SHORT).show();
                    }

                    else if (data.getAppName() == "Khan Academy") {
                        String url = "https://play.google.com/apps/testing/org.khanacademy.android";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        view.getContext().startActivity(intent);
                        Toast.makeText(view.getContext(), "App is:" + data.getAppName(), Toast.LENGTH_SHORT).show();
                    }

                    else if (data.getAppName() == "Microsoft Flow") {
                        String url = "https://play.google.com/apps/testing/com.microsoft.flow";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        view.getContext().startActivity(intent);
                        Toast.makeText(view.getContext(), "App is:" + data.getAppName(), Toast.LENGTH_SHORT).show();
                    }

                    else if (data.getAppName() == "CamScanner -Phone PDF Creator") {
                        String url = "https://play.google.com/apps/testing/com.intsig.camscanner";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        view.getContext().startActivity(intent);
                        Toast.makeText(view.getContext(), "App is:" + data.getAppName(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}
