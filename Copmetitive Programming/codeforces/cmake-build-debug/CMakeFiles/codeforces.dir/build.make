# CMAKE generated file: DO NOT EDIT!
# Generated by "MinGW Makefiles" Generator, CMake Version 3.23

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:

#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:

# Disable VCS-based implicit rules.
% : %,v

# Disable VCS-based implicit rules.
% : RCS/%

# Disable VCS-based implicit rules.
% : RCS/%,v

# Disable VCS-based implicit rules.
% : SCCS/s.%

# Disable VCS-based implicit rules.
% : s.%

.SUFFIXES: .hpux_make_needs_suffix_list

# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

#Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:
.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

SHELL = cmd.exe

# The CMake executable.
CMAKE_COMMAND = "C:\Program Files\JetBrains\CLion 2022.2.3\bin\cmake\win\bin\cmake.exe"

# The command to remove a file.
RM = "C:\Program Files\JetBrains\CLion 2022.2.3\bin\cmake\win\bin\cmake.exe" -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = "E:\CS-Education\Copmetitive Programming\codeforces"

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = "E:\CS-Education\Copmetitive Programming\codeforces\cmake-build-debug"

# Include any dependencies generated for this target.
include CMakeFiles/codeforces.dir/depend.make
# Include any dependencies generated by the compiler for this target.
include CMakeFiles/codeforces.dir/compiler_depend.make

# Include the progress variables for this target.
include CMakeFiles/codeforces.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/codeforces.dir/flags.make

CMakeFiles/codeforces.dir/main.cpp.obj: CMakeFiles/codeforces.dir/flags.make
CMakeFiles/codeforces.dir/main.cpp.obj: ../main.cpp
CMakeFiles/codeforces.dir/main.cpp.obj: CMakeFiles/codeforces.dir/compiler_depend.ts
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="E:\CS-Education\Copmetitive Programming\codeforces\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/codeforces.dir/main.cpp.obj"
	C:\PROGRA~1\JETBRA~1\CLION2~1.3\bin\mingw\bin\G__~1.EXE $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -MD -MT CMakeFiles/codeforces.dir/main.cpp.obj -MF CMakeFiles\codeforces.dir\main.cpp.obj.d -o CMakeFiles\codeforces.dir\main.cpp.obj -c "E:\CS-Education\Copmetitive Programming\codeforces\main.cpp"

CMakeFiles/codeforces.dir/main.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/codeforces.dir/main.cpp.i"
	C:\PROGRA~1\JETBRA~1\CLION2~1.3\bin\mingw\bin\G__~1.EXE $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "E:\CS-Education\Copmetitive Programming\codeforces\main.cpp" > CMakeFiles\codeforces.dir\main.cpp.i

CMakeFiles/codeforces.dir/main.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/codeforces.dir/main.cpp.s"
	C:\PROGRA~1\JETBRA~1\CLION2~1.3\bin\mingw\bin\G__~1.EXE $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "E:\CS-Education\Copmetitive Programming\codeforces\main.cpp" -o CMakeFiles\codeforces.dir\main.cpp.s

CMakeFiles/codeforces.dir/sets.cpp.obj: CMakeFiles/codeforces.dir/flags.make
CMakeFiles/codeforces.dir/sets.cpp.obj: ../sets.cpp
CMakeFiles/codeforces.dir/sets.cpp.obj: CMakeFiles/codeforces.dir/compiler_depend.ts
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="E:\CS-Education\Copmetitive Programming\codeforces\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_2) "Building CXX object CMakeFiles/codeforces.dir/sets.cpp.obj"
	C:\PROGRA~1\JETBRA~1\CLION2~1.3\bin\mingw\bin\G__~1.EXE $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -MD -MT CMakeFiles/codeforces.dir/sets.cpp.obj -MF CMakeFiles\codeforces.dir\sets.cpp.obj.d -o CMakeFiles\codeforces.dir\sets.cpp.obj -c "E:\CS-Education\Copmetitive Programming\codeforces\sets.cpp"

CMakeFiles/codeforces.dir/sets.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/codeforces.dir/sets.cpp.i"
	C:\PROGRA~1\JETBRA~1\CLION2~1.3\bin\mingw\bin\G__~1.EXE $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "E:\CS-Education\Copmetitive Programming\codeforces\sets.cpp" > CMakeFiles\codeforces.dir\sets.cpp.i

CMakeFiles/codeforces.dir/sets.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/codeforces.dir/sets.cpp.s"
	C:\PROGRA~1\JETBRA~1\CLION2~1.3\bin\mingw\bin\G__~1.EXE $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "E:\CS-Education\Copmetitive Programming\codeforces\sets.cpp" -o CMakeFiles\codeforces.dir\sets.cpp.s

# Object files for target codeforces
codeforces_OBJECTS = \
"CMakeFiles/codeforces.dir/main.cpp.obj" \
"CMakeFiles/codeforces.dir/sets.cpp.obj"

# External object files for target codeforces
codeforces_EXTERNAL_OBJECTS =

codeforces.exe: CMakeFiles/codeforces.dir/main.cpp.obj
codeforces.exe: CMakeFiles/codeforces.dir/sets.cpp.obj
codeforces.exe: CMakeFiles/codeforces.dir/build.make
codeforces.exe: CMakeFiles/codeforces.dir/linklibs.rsp
codeforces.exe: CMakeFiles/codeforces.dir/objects1.rsp
codeforces.exe: CMakeFiles/codeforces.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir="E:\CS-Education\Copmetitive Programming\codeforces\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_3) "Linking CXX executable codeforces.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\codeforces.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/codeforces.dir/build: codeforces.exe
.PHONY : CMakeFiles/codeforces.dir/build

CMakeFiles/codeforces.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\codeforces.dir\cmake_clean.cmake
.PHONY : CMakeFiles/codeforces.dir/clean

CMakeFiles/codeforces.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" "E:\CS-Education\Copmetitive Programming\codeforces" "E:\CS-Education\Copmetitive Programming\codeforces" "E:\CS-Education\Copmetitive Programming\codeforces\cmake-build-debug" "E:\CS-Education\Copmetitive Programming\codeforces\cmake-build-debug" "E:\CS-Education\Copmetitive Programming\codeforces\cmake-build-debug\CMakeFiles\codeforces.dir\DependInfo.cmake" --color=$(COLOR)
.PHONY : CMakeFiles/codeforces.dir/depend

