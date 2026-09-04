package com.hecorat.screenrecorder.free.activities.main_setting_drawer;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import androidx.activity.d0;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.g;
import com.hecorat.screenrecorder.free.R;
import java.io.IOException;
import java.net.ServerSocket;
import nh.l0;
import tf.u0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class WifiTransferActivity extends ff.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f22849d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.hecorat.screenrecorder.free.helpers.webserver.a f22850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private BroadcastReceiver f22851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private u0 f22852g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends d0 {
        a(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.d0
        public void d() {
            if (WifiTransferActivity.this.f22849d) {
                new AlertDialog.Builder(WifiTransferActivity.this, R.style.GeneralDialogTheme).setTitle(R.string.confirm_exit).setMessage(R.string.wifi_access_warning_exit_msg).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.hecorat.screenrecorder.free.activities.main_setting_drawer.d
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        WifiTransferActivity.this.finish();
                    }
                }).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).show();
            } else {
                WifiTransferActivity.this.finish();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (WifiTransferActivity.this.I0().equals("http://0.0.0.0:")) {
                WifiTransferActivity.this.f22852g.B.setVisibility(4);
                WifiTransferActivity.this.f22852g.D.setVisibility(4);
                WifiTransferActivity.this.f22852g.E.setText(R.string.no_wifi);
                return;
            }
            if (!WifiTransferActivity.this.f22849d && WifiTransferActivity.this.N0()) {
                WifiTransferActivity.this.f22849d = true;
            }
            WifiTransferActivity.this.L0();
            WifiTransferActivity.this.f22852g.B.setVisibility(0);
            WifiTransferActivity.this.f22852g.D.setVisibility(0);
            WifiTransferActivity.this.f22852g.F.setText(WifiTransferActivity.this.J0());
        }

        /* synthetic */ b(WifiTransferActivity wifiTransferActivity, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String I0() {
        int ipAddress = ((WifiManager) getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress();
        return "http://" + String.format(l0.e(), "%d.%d.%d.%d", Integer.valueOf(ipAddress & 255), Integer.valueOf((ipAddress >> 8) & 255), Integer.valueOf((ipAddress >> 16) & 255), Integer.valueOf((ipAddress >> 24) & 255)) + ":";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String J0() {
        return ((WifiManager) getApplicationContext().getSystemService("wifi")).getConnectionInfo().getSSID();
    }

    private boolean K0() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        return (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasTransport(1) || !networkCapabilities.hasCapability(12)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0() {
        this.f22852g.E.setText(I0() + this.f22848c);
    }

    private void M0() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
        u0(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: hf.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f40348a.getOnBackPressedDispatcher().l();
            }
        });
        androidx.appcompat.app.a aVarL0 = l0();
        if (aVarL0 != null) {
            aVarL0.C(R.string.wifi_transfer);
            aVarL0.t(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean N0() {
        int i10;
        if (this.f22849d) {
            return false;
        }
        try {
            i10 = 8888;
            try {
                new ServerSocket(8888).close();
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            i10 = 6666;
        }
        this.f22848c = i10;
        try {
            com.hecorat.screenrecorder.free.helpers.webserver.a aVar = new com.hecorat.screenrecorder.free.helpers.webserver.a(this.f22848c, this);
            this.f22850e = aVar;
            aVar.t();
            return true;
        } catch (Exception unused3) {
            return false;
        }
    }

    private void O0() {
        com.hecorat.screenrecorder.free.helpers.webserver.a aVar;
        if (!this.f22849d || (aVar = this.f22850e) == null) {
            return;
        }
        aVar.w();
    }

    @Override // ff.b, androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        u0 u0Var = (u0) g.j(this, R.layout.activity_wifi_transfer);
        this.f22852g = u0Var;
        y0(u0Var.B());
        M0();
        if (!K0()) {
            this.f22852g.B.setVisibility(4);
            this.f22852g.D.setVisibility(4);
            this.f22852g.E.setText(R.string.no_wifi);
        } else if (!this.f22849d && N0()) {
            this.f22849d = true;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        b bVar = new b(this, null);
        this.f22851f = bVar;
        l0.z(this, bVar, intentFilter);
        getOnBackPressedDispatcher().g(this, new a(true));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        O0();
        this.f22849d = false;
        BroadcastReceiver broadcastReceiver = this.f22851f;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
    }
}
