/*
 * MULTIPLE INHERITANCE (concept only - no executable multiple-inheritance code)
 * ------------------------------------------------------------------------------
 * Multiple inheritance would mean one class extends more than one parent
 * class at the same time, for example:
 *
 *     class C extends A, B { }     // <-- INVALID Java, shown only in this comment
 *
 * Java deliberately does not allow a class to extend two classes. The
 * classic reason is the "diamond problem": if both A and B declared a
 * method with the same signature, e.g. void show(), then an object of C
 * would have two different inherited versions of show() and the compiler
 * would have no rule for choosing between them. Rather than picking one
 * arbitrarily (which could silently hide bugs), Java avoids the ambiguity
 * completely by only ever allowing "extends" to name one class.
 *
 *
 * HYBRID INHERITANCE (concept only)
 * ------------------------------------------------------------------------------
 * Hybrid inheritance is simply a combination of more than one basic
 * inheritance pattern (single, hierarchical, multilevel) used together in
 * one class structure, for example:
 *
 *                     Person
 *                    /      \
 *             Employee        Patient        <-- hierarchical part
 *                |
 *             Manager                        <-- multilevel part
 *
 * Person has two children (hierarchical), and one of those children,
 * Employee, itself has a child, Manager (multilevel). Every "extends" in
 * this picture still names only ONE parent, so the whole tree is legal in
 * Java - it becomes "multiple inheritance" (and therefore illegal) only if
 * some class tried to merge two branches back together by extending two
 * classes directly, which is exactly what the first section above forbids.
 *
 *
 * WHY INTERFACES MATTER HERE
 * ------------------------------------------------------------------------------
 * Java still lets a class gain behavior from several sources - it just does
 * this through interfaces instead of classes. A class can implement several
 * interfaces at once (class C implements X, Y { }), because an interface
 * normally only declares what a method should do, not a field or a
 * ready-made implementation, so the diamond-problem ambiguity above does not
 * arise the same way. This is why interfaces are the standard Java tool for
 * multiple/hybrid inheritance of type and behavior - but, as instructed,
 * this program does not declare or implement any interface.
 */
public class InheritanceConceptMain {
    public static void main(String[] args) {
        System.out.println("See the comments above main() for an explanation of:");
        System.out.println(" 1. Why Java does not allow a class to extend two classes.");
        System.out.println(" 2. What hybrid inheritance means as a combination of patterns.");
        System.out.println(" 3. Why interfaces are the usual Java answer to multiple/hybrid inheritance.");
    }
}
