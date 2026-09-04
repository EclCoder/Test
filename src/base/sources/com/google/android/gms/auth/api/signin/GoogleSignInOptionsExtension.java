package com.google.android.gms.auth.api.signin;

import android.os.Bundle;
import com.google.android.gms.common.api.Scope;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface GoogleSignInOptionsExtension {
    public static final int FITNESS = 3;
    public static final int GAMES = 1;

    int getExtensionType();

    List<Scope> getImpliedScopes();

    Bundle toBundle();
}
