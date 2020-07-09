def is_valid(s):
    """
    :type s: str
    :rtype: bool
    """
    s_length = len(s)

    if s_length == 0:
        return True

    if s_length % 2 != 0:
        return False

    size = 0
    stack = []

    for char in s:
        if char == '(' or char == '[' or char == '{':
            stack.append(char)
        else:
            if char == ')':
                if stack[size] != '(':
                    return False
            elif char == ']':
                if stack[size] != '[':
                    return False
            elif char == '}':
                if stack[size] != '{':
                    return False
            
            stack.pop()
        size = len(stack) - 1

    return True
