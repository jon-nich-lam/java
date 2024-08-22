# Heap
## This is further review on heaps used by Java Virtual Machine (JVM)

`Heap` is a part of memory used by JVM for dynamic memory allocation.
- This is where java objects are stored during runtime.
- `new` is the keyword for creating a new object and the memory for that object is allocated on the `heap`

Here are some key points about heaps.
1. `Garbage Collection`: The heap is manager by Java's garbage collector which automatically reclaims memory that is no longer in use or reference by the program. This helps with memory leaks.
    - `Memory Leak` occurs in a program when it fails to releases memory that is no longer needed which causes reduced availability in memory.
2. `Memory Management`: Java divides tghe heap into different generations (Young, Old, and Permanent) to optimize garbage collection.
    - `Young Generation`: Where new objects are allocated. The garbage collection process: `minor GC`.
    - `Old Generation (Tenured Generation)`: Where long-lived objects are stored. The garbage collection process: `major GC`
    - `Permanent Generation (Prem Gen)`: Used to store metadata about the classes, methods, etc. (Replaced with Metaspace)