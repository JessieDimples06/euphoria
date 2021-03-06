/*
 * Copyright 2016-2020 Seznam.cz, a.s.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cz.seznam.euphoria.executor.local;

import cz.seznam.euphoria.core.client.io.SpillTools;
import cz.seznam.euphoria.core.client.operator.state.StateContext;
import cz.seznam.euphoria.core.client.operator.state.StorageProvider;

/**
 * Implementation of {@code StateContext} for {@code LocalExecutor}.
 */
class LocalStateContext implements StateContext {

  private final StorageProvider storageProvider = new LocalStorageProvider();

  private final SpillTools spillTools = new LocalSpillTools();

  @Override
  public StorageProvider getStorageProvider() {
    return storageProvider;
  }

  @Override
  public SpillTools getSpillTools() {
    return spillTools;
  }

}
