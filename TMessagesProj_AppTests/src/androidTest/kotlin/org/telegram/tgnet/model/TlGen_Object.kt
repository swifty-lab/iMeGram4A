package org.iMeGram.tgnet.model

import org.iMeGram.tgnet.OutputSerializedData

public interface TlGen_Object {
    fun serializeToStream(stream: OutputSerializedData)
}