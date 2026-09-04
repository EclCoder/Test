package com.facebook.login;

import com.google.android.gms.common.Scopes;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f15913d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f15914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f15916c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ x(Collection collection, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 2) != 0) {
            str = UUID.randomUUID().toString();
            kotlin.jvm.internal.s.g(str, "randomUUID().toString()");
        }
        this(collection, str);
    }

    public final String a() {
        return this.f15916c;
    }

    public final String b() {
        return this.f15915b;
    }

    public final Set c() {
        return this.f15914a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(Collection collection, String nonce) {
        this(collection, nonce, m0.c());
        kotlin.jvm.internal.s.h(nonce, "nonce");
    }

    public x(Collection collection, String nonce, String codeVerifier) {
        kotlin.jvm.internal.s.h(nonce, "nonce");
        kotlin.jvm.internal.s.h(codeVerifier, "codeVerifier");
        if (l0.a(nonce) && m0.d(codeVerifier)) {
            HashSet hashSet = collection != null ? new HashSet(collection) : new HashSet();
            hashSet.add(Scopes.OPEN_ID);
            Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
            kotlin.jvm.internal.s.g(setUnmodifiableSet, "unmodifiableSet(permissions)");
            this.f15914a = setUnmodifiableSet;
            this.f15915b = nonce;
            this.f15916c = codeVerifier;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
