package com.iab.omid.library.bytedance2.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.bytedance2.adsession.DeviceCategory;
import com.iab.omid.library.bytedance2.adsession.OutputDeviceStatus;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static OutputDeviceStatus f23876a = OutputDeviceStatus.UNKNOWN;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            OutputDeviceStatus outputDeviceStatus;
            if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                if (intExtra == 0) {
                    outputDeviceStatus = OutputDeviceStatus.NOT_DETECTED;
                } else if (intExtra != 1) {
                    return;
                } else {
                    outputDeviceStatus = OutputDeviceStatus.UNKNOWN;
                }
                OutputDeviceStatus unused = e.f23876a = outputDeviceStatus;
            }
        }
    }

    public static OutputDeviceStatus a() {
        return com.iab.omid.library.bytedance2.utils.a.a() != DeviceCategory.CTV ? OutputDeviceStatus.UNKNOWN : f23876a;
    }

    public static void a(Context context) {
        context.registerReceiver(new a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
