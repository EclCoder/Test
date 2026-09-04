package com.google.api.client.util;

import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface ObjectParser {
    <T> T parseAndClose(InputStream inputStream, Charset charset, Class<T> cls);

    Object parseAndClose(InputStream inputStream, Charset charset, Type type);

    <T> T parseAndClose(Reader reader, Class<T> cls);

    Object parseAndClose(Reader reader, Type type);
}
