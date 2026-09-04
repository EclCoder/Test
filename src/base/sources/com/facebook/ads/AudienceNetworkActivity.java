package com.facebook.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.window.OnBackInvokedCallback;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class AudienceNetworkActivity extends Activity {
    private AudienceNetworkActivityApi mAudienceNetworkActivityApi;
    private final AudienceNetworkActivityApi mAudienceNetworkActivityParentApi = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements AudienceNetworkActivityApi {
        a() {
        }

        @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            AudienceNetworkActivity.super.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void finish(int i10) {
            AudienceNetworkActivity.super.finish();
        }

        @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void onActivityResult(int i10, int i11, Intent intent) {
            AudienceNetworkActivity.super.onActivityResult(i10, i11, intent);
        }

        @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void onBackPressed() {
            AudienceNetworkActivity.super.onBackPressed();
        }

        @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void onConfigurationChanged(Configuration configuration) {
            AudienceNetworkActivity.super.onConfigurationChanged(configuration);
        }

        @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void onCreate(Bundle bundle) {
            AudienceNetworkActivity.super.onCreate(bundle);
        }

        @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void onDestroy() {
            AudienceNetworkActivity.super.onDestroy();
        }

        @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void onPause() {
            AudienceNetworkActivity.super.onPause();
        }

        @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void onResume() {
            AudienceNetworkActivity.super.onResume();
        }

        @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void onSaveInstanceState(Bundle bundle) {
            AudienceNetworkActivity.super.onSaveInstanceState(bundle);
        }

        @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void onStart() {
            AudienceNetworkActivity.super.onStart();
        }

        @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public void onStop() {
            AudienceNetworkActivity.super.onStop();
        }

        @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return AudienceNetworkActivity.super.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements OnBackInvokedCallback {
        b() {
        }

        public void onBackInvoked() {
            AudienceNetworkActivity.this.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.mAudienceNetworkActivityApi.dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public void finish() {
        this.mAudienceNetworkActivityApi.finish(0);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        this.mAudienceNetworkActivityApi.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mAudienceNetworkActivityApi.onBackPressed();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mAudienceNetworkActivityApi.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        AudienceNetworkActivityApi audienceNetworkActivityApiCreateAudienceNetworkActivity = DynamicLoaderFactory.makeLoader(this).createAudienceNetworkActivity(this, this.mAudienceNetworkActivityParentApi);
        this.mAudienceNetworkActivityApi = audienceNetworkActivityApiCreateAudienceNetworkActivity;
        audienceNetworkActivityApiCreateAudienceNetworkActivity.onCreate(bundle);
        if (Build.VERSION.SDK_INT <= 35 || getApplicationInfo().targetSdkVersion <= 35) {
            return;
        }
        getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, new b());
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        this.mAudienceNetworkActivityApi.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        this.mAudienceNetworkActivityApi.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mAudienceNetworkActivityApi.onResume();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.mAudienceNetworkActivityApi.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mAudienceNetworkActivityApi.onStart();
    }

    @Override // android.app.Activity
    protected void onStop() {
        this.mAudienceNetworkActivityApi.onStop();
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.mAudienceNetworkActivityApi.onTouchEvent(motionEvent);
    }
}
