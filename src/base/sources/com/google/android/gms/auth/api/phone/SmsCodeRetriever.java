package com.google.android.gms.auth.api.phone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.p002authapiphone.zzr;
import com.google.android.gms.internal.p002authapiphone.zzv;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class SmsCodeRetriever {
    public static final String EXTRA_SMS_CODE = "com.google.android.gms.auth.api.phone.EXTRA_SMS_CODE";
    public static final String EXTRA_SMS_CODE_LINE = "com.google.android.gms.auth.api.phone.EXTRA_SMS_CODE_LINE";
    public static final String EXTRA_STATUS = "com.google.android.gms.auth.api.phone.EXTRA_STATUS";
    public static final String SMS_CODE_RETRIEVED_ACTION = "com.google.android.gms.auth.api.phone.SMS_CODE_RETRIEVED";

    private SmsCodeRetriever() {
    }

    public static SmsCodeAutofillClient getAutofillClient(Activity activity) {
        return new zzr(activity);
    }

    public static SmsCodeBrowserClient getBrowserClient(Activity activity) {
        return new zzv(activity);
    }

    public static SmsCodeAutofillClient getAutofillClient(Context context) {
        return new zzr(context);
    }

    public static SmsCodeBrowserClient getBrowserClient(Context context) {
        return new zzv(context);
    }
}
