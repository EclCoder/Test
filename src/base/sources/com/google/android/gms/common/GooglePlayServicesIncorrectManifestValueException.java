package com.google.android.gms.common;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i10) {
        int i11 = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 104 + String.valueOf(i10).length() + 194);
        sb2.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
        sb2.append(i11);
        sb2.append(" but found ");
        sb2.append(i10);
        sb2.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        super(i10, sb2.toString());
    }
}
