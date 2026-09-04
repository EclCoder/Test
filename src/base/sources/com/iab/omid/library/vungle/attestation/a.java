package com.iab.omid.library.vungle.attestation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f24209a;

    public a(Map<String, String> map) {
        this.f24209a = map == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(map));
    }

    public Map<String, String> a() {
        return this.f24209a;
    }
}
