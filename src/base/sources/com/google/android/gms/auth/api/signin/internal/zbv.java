package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import androidx.loader.app.a;
import androidx.loader.content.b;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zbv implements a.InterfaceC0049a {
    final /* synthetic */ SignInHubActivity zba;

    /* synthetic */ zbv(SignInHubActivity signInHubActivity, byte[] bArr) {
        Objects.requireNonNull(signInHubActivity);
        this.zba = signInHubActivity;
    }

    @Override // androidx.loader.app.a.InterfaceC0049a
    public final b onCreateLoader(int i10, Bundle bundle) {
        return new zbc(this.zba, GoogleApiClient.getAllClients());
    }

    @Override // androidx.loader.app.a.InterfaceC0049a
    public final /* bridge */ /* synthetic */ void onLoadFinished(b bVar, Object obj) {
        SignInHubActivity signInHubActivity = this.zba;
        signInHubActivity.setResult(signInHubActivity.zba(), signInHubActivity.zbb());
        signInHubActivity.finish();
    }

    @Override // androidx.loader.app.a.InterfaceC0049a
    public final void onLoaderReset(b bVar) {
    }
}
