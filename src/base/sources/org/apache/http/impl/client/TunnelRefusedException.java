package org.apache.http.impl.client;

import org.apache.http.HttpException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class TunnelRefusedException extends HttpException {
    private static final long serialVersionUID = -8646722842745617323L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final co.q f49264a;

    public TunnelRefusedException(String str, co.q qVar) {
        super(str);
        this.f49264a = qVar;
    }
}
