/*
 * (C) ActiveViam 2020
 * ALL RIGHTS RESERVED. This material is the CONFIDENTIAL and PROPRIETARY
 * property of ActiveViam. Any unauthorized use
 * reproduction or transfer of this material is strictly prohibited
 */

package com.activeviam.chunk;

public class TestHeapDoubleChunk implements SpecTestDoubleChunk {

  @Override
  public DoubleChunk createChunk(int capacity) {
    return new HeapDoubleChunk(capacity);
  }
}
