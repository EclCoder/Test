/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0005ec28
 * Address  : 0005ec28
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0005ec28(int *param_1,byte *param_2)

{
  undefined4 uVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  
  puVar2 = (undefined8 *)*param_1;
  if ((*param_2 & 1) == 0) {
    uVar3 = *(undefined8 *)param_2;
    *(undefined4 *)(puVar2 + 1) = *(undefined4 *)(param_2 + 8);
    *puVar2 = uVar3;
  }
  else {
    FUN_000289d4(puVar2,*(undefined4 *)(param_2 + 8),*(undefined4 *)(param_2 + 4));
  }
  uVar1 = *(undefined4 *)(param_2 + 0x14);
  *(undefined4 *)(puVar2 + 2) = *(undefined4 *)(param_2 + 0x10);
  *(undefined4 *)((int)puVar2 + 0x14) = uVar1;
  if ((param_2[0x18] & 1) == 0) {
    uVar3 = *(undefined8 *)(param_2 + 0x18);
    *(undefined4 *)(puVar2 + 4) = *(undefined4 *)(param_2 + 0x20);
    puVar2[3] = uVar3;
    return;
  }
  FUN_000289d4(puVar2 + 3,*(undefined4 *)(param_2 + 0x20),*(undefined4 *)(param_2 + 0x1c));
  return;
}


