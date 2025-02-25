import sympy as sp

# Define symbolic variables
x, y, z = sp.symbols('x y z')

# Algebraic Expressions
expr1 = (x + y) ** 2
expr2 = x**2 - y**2

# 1. Expand expressions
expanded_expr1 = sp.expand(expr1)
expanded_expr2 = sp.expand(expr2)

# 2. Factor expressions
factored_expr1 = sp.factor(expanded_expr1)
factored_expr2 = sp.factor(expanded_expr2)

# 3. Simplify expressions
simplified_expr = sp.simplify((x**2 + 2*x*y + y**2) / (x + y))

# 4. Differentiate expressions
derivative_expr = sp.diff(x**3 + 3*x**2 - 5*x + 2, x)

# 5. Solve equations
solution = sp.solve(x**2 - 5*x + 6, x)

# Display results
print("Expanded Expressions:")
print("  (x + y)^2 =", expanded_expr1)
print("  x^2 - y^2 =", expanded_expr2)

print("\nFactored Expressions:")
print("  Expanded (x + y)^2 factored =", factored_expr1)
print("  Expanded x^2 - y^2 factored =", factored_expr2)

print("\nSimplified Expression:")
print("  (x^2 + 2xy + y^2) / (x + y) =", simplified_expr)

print("\nDerivative:")
print("  d/dx of x^3 + 3x^2 - 5x + 2 =", derivative_expr)

print("\nEquation Solution:")
print("  Solutions of x^2 - 5x + 6 =", solution)
