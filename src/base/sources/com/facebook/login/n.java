package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class n extends g0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static ScheduledThreadPoolExecutor f15669f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f15670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f15668e = new b(null);
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public n createFromParcel(Parcel source) {
            kotlin.jvm.internal.s.h(source, "source");
            return new n(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public n[] newArray(int i10) {
            return new n[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized ScheduledThreadPoolExecutor a() {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
            try {
                if (n.f15669f == null) {
                    n.f15669f = new ScheduledThreadPoolExecutor(1);
                }
                scheduledThreadPoolExecutor = n.f15669f;
                if (scheduledThreadPoolExecutor == null) {
                    kotlin.jvm.internal.s.w("backgroundExecutor");
                    scheduledThreadPoolExecutor = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return scheduledThreadPoolExecutor;
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(w loginClient) {
        super(loginClient);
        kotlin.jvm.internal.s.h(loginClient, "loginClient");
        this.f15670d = "device_auth";
    }

    private final void A(w.e eVar) {
        androidx.fragment.app.s sVarN = e().n();
        if (sVarN == null || sVarN.isFinishing()) {
            return;
        }
        m mVarW = w();
        mVarW.show(sVarN.getSupportFragmentManager(), "login_with_facebook");
        mVarW.U(eVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.g0
    public String g() {
        return this.f15670d;
    }

    @Override // com.facebook.login.g0
    public int t(w.e request) {
        kotlin.jvm.internal.s.h(request, "request");
        A(request);
        return 1;
    }

    protected m w() {
        return new m();
    }

    public void x() {
        e().j(w.f.f15803i.a(e().u(), "User canceled log in."));
    }

    public void y(Exception ex) {
        kotlin.jvm.internal.s.h(ex, "ex");
        e().j(w.f.c.d(w.f.f15803i, e().u(), null, ex.getMessage(), null, 8, null));
    }

    public void z(String accessToken, String applicationId, String userId, Collection collection, Collection collection2, Collection collection3, com.facebook.l lVar, Date date, Date date2, Date date3) {
        kotlin.jvm.internal.s.h(accessToken, "accessToken");
        kotlin.jvm.internal.s.h(applicationId, "applicationId");
        kotlin.jvm.internal.s.h(userId, "userId");
        e().j(w.f.f15803i.e(e().u(), new com.facebook.a(accessToken, applicationId, userId, collection, collection2, collection3, lVar, date, date2, date3, null, UserVerificationMethods.USER_VERIFY_ALL, null)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected n(Parcel parcel) {
        super(parcel);
        kotlin.jvm.internal.s.h(parcel, "parcel");
        this.f15670d = "device_auth";
    }
}
